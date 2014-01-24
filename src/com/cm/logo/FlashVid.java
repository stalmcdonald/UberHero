package com.cm.logo;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.cm.uberhero.R;

public class FlashVid extends Activity {

	//global variables
	VideoView vidView;
	Context _context;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flvid);
		
		//set context
		_context = this;
		

			
				
		Button button = (Button) findViewById(R.id.bttn);
		button.setOnClickListener(new OnClickListener(){

					@Override
					public void onClick(View arg0) {
						// Set and Play Video
						vidView = (VideoView) findViewById(R.id.videoView1);
						//create a path for video
						String uriPath = "android.resource://" + getPackageName() + "/" + R.raw.flashlogo;
						vidView.setVideoURI(Uri.parse(uriPath));
						vidView.setMediaController(new MediaController(_context));  //allows to have control video features
						vidView.start();
					}
					
				});
	}

}