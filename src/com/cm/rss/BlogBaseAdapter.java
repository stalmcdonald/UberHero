package com.cm.rss;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.cm.uberhero.R;

public class BlogBaseAdapter extends BaseAdapter {

	private final List<RSSBasics> listItems;
	private final Context context;

	public BlogBaseAdapter(Context context, List<RSSBasics> li) {
		this.listItems = li;
		this.context = context;
	}

	//gets the view of the item selected 
	@Override
	public View getView(int position, View blogView, ViewGroup parent) {
		ViewHolder holder;
		if (blogView == null) {
			blogView = View.inflate(context, R.layout.rss_item, null);
			holder = new ViewHolder();
			holder.itemTitle = (TextView) blogView.findViewById(R.id.blogTitle);
			blogView.setTag(holder);
		} else {
			holder = (ViewHolder) blogView.getTag();
		}
		holder.itemTitle.setText(listItems.get(position).fetchBlogTitle());
		return blogView;
	}

	static class ViewHolder {
		TextView itemTitle;
	}
	
	//get number of blog items
		@Override
		public int getCount() {
			return listItems.size();
		}

		//gets the position of the items in the list
		@Override
		public Object getItem(int position) {
			return listItems.get(position);
		}

		//gets the id of the item
		@Override
		public long getItemId(int id) {
			return id;
		}
}
