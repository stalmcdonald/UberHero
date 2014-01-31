package com.cm.rss;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.cm.uberhero.R;

public class RssFeedActivity extends FragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rss);
		
		//Detects the network connection
//  		_connected = com.cm.rss.ConnectionFile.getConnectionStatus(_context);
//  		if(_connected){
//  			Log.i("NETWORK CONNECTION ", com.cm.rss.ConnectionFile.getConnnectionType(_context));
//  		}

		//adds fragment container if not already availble
		if (savedInstanceState == null) {
			addRssFragment();//doesn't add if returning
		}
	}

	private void addRssFragment() {
		FragmentManager fm = getSupportFragmentManager();
		FragmentTransaction transaction = fm.beginTransaction();
		RssFeedFragment frag = new RssFeedFragment();
		transaction.add(R.id.frag_holder, frag);
		transaction.commit();
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putBoolean("fragment_added", true);
	}
}