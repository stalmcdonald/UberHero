/*
 * RSS Feed Items
 */

package com.cm.rss;

//grabs rss item in the list
public class RSSBasics {

	private final String header;
	private final String rsslink;

	public RSSBasics(String blogTitle, String feedLink) {
		this.header = blogTitle;
		this.rsslink = feedLink;
	}

	public String fetchBlogTitle() {
		return header;
	}

	public String fetchFeedLink() {
		return rsslink;
	}
}
