/*
 * RSSFEED Link stored here
 * Services
 */
package com.cm.rss;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.List;

import org.xmlpull.v1.XmlPullParserException;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;

public class Service extends IntentService {

	private static final String RSS_LINK = "http://actionmoviebuff.com/feed/";
	public static final String ITEMS = "items";
	public static final String RECEIVER = "receiver";

	public Service() {
		super("Service");
	}

	//link to feed
	public InputStream fetchIStream(String link) {
		try {
			URL url = new URL(link);
			return url.openConnection().getInputStream();
		} catch (IOException e) {
			Log.w(Tag.TAG, "Exception", e);
			return null;
		}
	}
	
	//parses the feed
	@Override
	protected void onHandleIntent(Intent intent) {
		Log.d(Tag.TAG, "Service has begun");
		List<RSSBasics> rssItems = null;
		try {
			ParseActivity p = new ParseActivity();
			rssItems = p.parse(fetchIStream(RSS_LINK));
		} catch (XmlPullParserException e) {
			Log.w(e.getMessage(), e);
		} catch (IOException e) {
			Log.w(e.getMessage(), e);
		}
		Bundle bundle = new Bundle();
		bundle.putSerializable(ITEMS, (Serializable) rssItems);
		ResultReceiver rr = intent.getParcelableExtra(RECEIVER);
		rr.send(0, bundle);
	}

}
