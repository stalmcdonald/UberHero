package com.cm.uberhero;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ThemeSongActivity extends Activity implements OnClickListener{
	
	//Button supermanbttn, batmanbttn, jlbttn, JLAmbttn;
	Button supermanTheme, batmanTheme, jlTheme, JLATheme;
	String supermanStart, batmanStart, jlStart, jlaStart;
	MediaPlayer mediaPlay;
	Context _context;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.theme);
		
		//set context
		_context = this;
		
				
		//Set buttons
		supermanTheme = (Button) findViewById(R.id.supermanbttn);
		supermanStart = "Play Superman Theme";
		
		batmanTheme = (Button) findViewById(R.id.batmanbttn);
		batmanStart = "Play Batman Theme";
		
		jlTheme = (Button) findViewById(R.id.jlbttn);
		jlStart = "Play Justice League Theme";
		
		JLATheme = (Button) findViewById(R.id.JLAmbttn);
		jlaStart="Play Justice League Unlimited Theme";
		
		//set up onclick listeners for buttons
		findViewById(R.id.batmanbttn).setOnClickListener(this);
		findViewById(R.id.supermanbttn).setOnClickListener(this);
		findViewById(R.id.jlbttn).setOnClickListener(this);
		findViewById(R.id.JLAmbttn).setOnClickListener(this);
	}
	
	 

	/* (non-Javadoc)
	 * @see android.app.Activity#onDestroy()
	 */
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		mediaPlay.release();
	}



	/* (non-Javadoc)
	 * @see android.app.Activity#onPause()
	 */
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		mediaPlay.pause();
	}



	/* (non-Javadoc)
	 * @see android.app.Activity#onStop()
	 */
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		mediaPlay.stop();
	}



	@Override
	public void onClick(View v) {
		// setup switch case buttons for music
		switch (v.getId()){
		
		case R.id.supermanbttn:
//			mediaPlay = MediaPlayer.create( _context, R.raw.supermantheme);
//			try{
//				if(mediaPlay != null){
//					if (mediaPlay.isPlaying()){
//					
//					mediaPlay.stop();
//					}else{
//						
//						mediaPlay.start();
//					}
//				}
//			}catch (Exception e){
//				Log.e("play_pause",""+e);
//				
//			}
			//add music/sound to media player
			mediaPlay = MediaPlayer.create( _context, R.raw.supermantheme);
			//starting and stopping the audio
			if(supermanStart.equals("Play Superman Theme")){
				mediaPlay.start();
				supermanStart = "Pause";
				supermanTheme.setText(supermanStart);
			}	
			else{
				if(supermanStart.equals("Pause")){
					mediaPlay.stop();
				supermanStart = "Play Superman Theme";//changes text back to play theme
				supermanTheme.setText(supermanStart);	
			}
			}
			break;
			
		case R.id.batmanbttn:
			//add music/sound to media player
			mediaPlay = MediaPlayer.create( _context, R.raw.battheme);
			//starting and stopping the audio
			if(batmanStart.equals("Play Batman Theme")){
				mediaPlay.start();
				batmanStart = "Pause";
				batmanTheme.setText(batmanStart);
				
			}else {
				mediaPlay.pause();
				batmanStart = "Play Batman Theme";//changes text back to play theme
				batmanTheme.setText(batmanStart);					
			}
			break;
			
		case R.id.jlbttn:
			//add music/sound to media player
			mediaPlay = MediaPlayer.create( _context, R.raw.jltheme);
			//starting and stopping the audio
			if(jlStart.equals("Play Justice League Theme")){
				mediaPlay.start();
				jlStart = "Pause";
				jlTheme.setText(jlStart);
				
			}else {
				mediaPlay.pause();
				jlStart = "Play Justice League Theme";//changes text back to play theme
				jlTheme.setText(jlStart);					
			}
			break;
			
		case R.id.JLAmbttn:
			//add music/sound to media player
			mediaPlay = MediaPlayer.create( _context, R.raw.jlutheme);
			//starting and stopping the audio
			if(jlaStart.equals("Play Justice League Unlimited Theme")){
				mediaPlay.start();
				jlaStart = "Pause";
				JLATheme.setText(jlaStart);
				
			}else {
				mediaPlay.pause();
				jlaStart = "Play Justice League Unlimited Theme";//changes text back to play theme
				JLATheme.setText(jlaStart);	
			
			}
			break;
		
		
		}	
	}
	
	public void onClick1(View v1) {
		if(mediaPlay.equals("Pause")){
			mediaPlay.stop();
	
	}
	}
}
