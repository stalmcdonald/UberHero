package com.cm.rss;

import java.net.URL;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import com.cm.uberhero.R;

public class WebActivity extends Activity implements OnClickListener{
	WebView uhWebView;
	Button goBack, goForward;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.web);

		//getting webView
		uhWebView = (WebView)findViewById(R.id.WebView);
		
		/*
		 * Screen Control: Optimal Usability: loads views zoomed out
		 */
		uhWebView.getSettings().setUseWideViewPort(true);
		uhWebView.getSettings().setLoadWithOverviewMode(true);
		
		/*
		 * Helps application perform action intended when clicking links
		 * allows links to load in my custom web browser
		 */
		uhWebView.setWebViewClient(new CustomBrowserView());
		
		//set up onclick listeners for buttons
		findViewById(R.id.goBack).setOnClickListener(this);
		findViewById(R.id.goForward).setOnClickListener(this);
		
		//gets reference to the intent 
		Intent intent = getIntent();
		//extracts the uri data from the intent object and converts Uri data to a URL Object
		Uri data = intent.getData();
		URL url = null;
		try {
			url = new URL(data.getScheme(), data.getHost(), data.getPath());
		}catch(Exception e){
			e.printStackTrace();	
		}
		//Loads the URL into the UberHero WebView, converting it into a string
		WebView uberWebView = (WebView) findViewById(R.id.WebView);
		uberWebView.loadUrl(url.toString());
	}
	
	//set up switch for buttons in case I add more functionality later
	@Override
	public void onClick(View v) {
		// set up switch case for navigation buttons
		switch (v.getId()){
			
		/*
		 * Custom back button functionality
		 */
		case R.id.goBack:
			if(uhWebView.canGoBack()){
				uhWebView.goBack();
			}
			break;
			/*
			 * Custom forward button functionality
			 */	
		case R.id.goForward:
			if(uhWebView.canGoForward()){
				uhWebView.goForward();
				break;
			}
		
		}
	}

	public static Boolean getConnectionStatus(Context _context) {
		return null;
	}

}