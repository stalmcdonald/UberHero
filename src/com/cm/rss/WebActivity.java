package com.cm.rss;

import java.net.URL;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import com.cm.uberhero.R;

public class WebActivity  extends Activity implements OnClickListener{
	WebView myWebView;
	EditText urlText;
	Button goBack, goForward, goButton;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		//makes activity full screen
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
		                                WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.web);
		//urlText = (EditText) findViewById(R.id.urlText);
		//getting webView
		myWebView = (WebView)findViewById(R.id.WebView);
		
		/*
		 * Screen Control: Optimal Usability: loads views zoomed out
		 */
		myWebView.getSettings().setUseWideViewPort(true);
		myWebView.getSettings().setLoadWithOverviewMode(true);
		
		/*
		 * Helps application perform action intended when clicking links
		 * allows links to load in my custom web browser
		 */
		myWebView.setWebViewClient(new CustomBrowserView());
		
		//default URL
		//myWebView.loadUrl("http://sfsailing.com/sailing/index.cfm");
		
		//set up onclick listeners for buttons
//		findViewById(R.id.goButton).setOnClickListener(this);
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
		//Loads the URL into myWebView, converting it into a string
		WebView myWebView = (WebView) findViewById(R.id.WebView);
		myWebView.loadUrl(url.toString());
	}
	
	//set up switch for buttons in case I add more functionality later
	@Override
	public void onClick(View v) {
		// set up switch case for buttons
		switch (v.getId()){
		
//		case R.id.goButton:
//			myWebView.loadUrl(urlText.getText().toString());
//			break;
			
		/*
		 * Custom back button functionality
		 */
		case R.id.goBack:
			if(myWebView.canGoBack()){
				myWebView.goBack();
			}
			break;
			/*
			 * Custom forward button functionality
			 */	
		case R.id.goForward:
			if(myWebView.canGoForward()){
				myWebView.goForward();
				break;
			}
		
		}
	}

}