package com.cm.rss;

import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.cm.uberhero.R;

public class RssFeedFragment extends Fragment implements OnItemClickListener {

	private ProgressBar pb;
	private ListView list;
	private View v;
	Context _context;
	//checks network connection
	Boolean _connected = false;//want to assume not connected
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
  		
		if (v == null) {
			v = inflater.inflate(R.layout.rss_frag, container, false);
			//Shows the data is being fetched
			pb = (ProgressBar) v.findViewById(R.id.pb);
			list = (ListView) v.findViewById(R.id.lv);
			list.setOnItemClickListener(this);
			fetchService();
			return v;
		}

		return container;
	}


	private void fetchService() {
		Intent blogIntent = new Intent(getActivity(), Service.class);
		blogIntent.putExtra(Service.RECEIVER, rr);
		getActivity().startService(blogIntent);
	}

	//get results from services and receive callback
	private final ResultReceiver rr = new ResultReceiver(new Handler()) {
		
		@Override
		protected void onReceiveResult(int resultCode, Bundle resultData) {
			//once results are shown the progressbar goes away
			pb.setVisibility(View.GONE);
			
			//pass results to service
			@SuppressWarnings("unchecked")
			List<RSSBasics> blogItems = (List<RSSBasics>) resultData.getSerializable(Service.ITEMS);
			if (blogItems != null) {
				BlogBaseAdapter adapter = new BlogBaseAdapter(getActivity(), blogItems);
				list.setAdapter(adapter);
			} 
		};
	};

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		BlogBaseAdapter bbadapter = (BlogBaseAdapter) parent.getAdapter();
		RSSBasics item = (RSSBasics) bbadapter.getItem(position);
		Uri uri = Uri.parse(item.fetchFeedLink());
		
		//goes to the web browser menu and shows blog post
			Intent webIntent = new Intent(Intent.ACTION_VIEW, uri);
			startActivity(webIntent);
		
	}
	
}
