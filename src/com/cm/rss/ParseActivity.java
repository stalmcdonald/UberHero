/*
 * Parsing Wordpress Feed
 */
package com.cm.rss;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import android.util.Xml;

public class ParseActivity {


	private final String spaces = null;

	public List<RSSBasics> parse(InputStream inputStream) throws XmlPullParserException, IOException {
		try {
			XmlPullParser xmlParser = Xml.newPullParser();
			xmlParser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
			xmlParser.setInput(inputStream, null);
			xmlParser.nextTag();
			return viewFeed(xmlParser);
		} finally {
			inputStream.close();
		}
	}

	//reads the feed
	private List<RSSBasics> viewFeed(XmlPullParser parser) throws XmlPullParserException, IOException {
		parser.require(XmlPullParser.START_TAG, null, "rss");
		String title = null;
		String link = null;
		List<RSSBasics> items = new ArrayList<RSSBasics>();
		while (parser.next() != XmlPullParser.END_DOCUMENT) {
			if (parser.getEventType() != XmlPullParser.START_TAG) {
				continue;
			}

			String name = parser.getName();
			if (name.equals("title")) {
				title = interpretTitle(parser);
			} else if (name.equals("link")) {
				link = intepretLink(parser);
			}
			if (title != null && link != null) {
				RSSBasics item = new RSSBasics(title, link);
				items.add(item);
				title = null;
				link = null;
			}
		}
		return items;
	}

	// Get the text of title and link
		private String interpretText(XmlPullParser parser) throws IOException, XmlPullParserException {
			String result = "";
			if (parser.next() == XmlPullParser.TEXT) {
				result = parser.getText();
				parser.nextTag();
			}
			return result;
		}
		
		//link
	private String intepretLink(XmlPullParser parser) throws XmlPullParserException, IOException {
		parser.require(XmlPullParser.START_TAG, spaces, "link");
		String link = interpretText(parser);
		parser.require(XmlPullParser.END_TAG, spaces, "link");
		return link;
	}

	//title
	private String interpretTitle(XmlPullParser parser) throws XmlPullParserException, IOException {
		parser.require(XmlPullParser.START_TAG, spaces, "title");
		String title = interpretText(parser);
		parser.require(XmlPullParser.END_TAG, spaces, "title");
		return title;
	}

}
