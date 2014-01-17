/*
 * Theme Song Activity
 * Plays popular superhero themes
 * User can use them as their own theme music when performing activities
 */
package com.cm.uberhero;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ThemeSongActivity extends Activity {
	
	Button supermanTheme, batmanTheme, jlTheme, JLATheme;
	String supermanStart, batStart, jlStart, jluStart;
	MediaPlayer mediaPlay, batMediaPlay, jlMediaPlay, jluMediaPlay;
	Context _context;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.theme);

		//set context
		_context = this;
		
		/*
		 * Superman Button
		 */
		mediaPlay = MediaPlayer.create( _context, R.raw.supermantheme);
		//Set buttons
		supermanTheme = (Button) findViewById(R.id.supermanbttn);
		
		supermanStart = "Play Superman Theme";
		//start button 1 listener
		supermanTheme.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View v){
						//starting and stopping the audio
						if(supermanStart.equals("Play Superman Theme")){
							mediaPlay.start();
							supermanStart = "Pause";
							supermanTheme.setText(supermanStart);
						}else {
							mediaPlay.pause();
							supermanStart = "Play Superman Theme";//changes text back to play
							supermanTheme.setText(supermanStart);					
						}
					}
					
				});
		
		/*
		 * Batman Button
		 */
		batMediaPlay = MediaPlayer.create( _context, R.raw.battheme);
		//Set button
		batmanTheme = (Button) findViewById(R.id.batmanbttn);
		batStart = "Play Batman Theme";
		//start button 2 listener
		batmanTheme.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View v1){

						//starting and stopping the audio
						if(batStart.equals("Play Batman Theme")){
							batMediaPlay.start();
							batStart = "Pause";
							batmanTheme.setText(batStart);
						}else {
							batMediaPlay.pause();
							batStart = "Play Batman Theme";//changes text back to play
							batmanTheme.setText(batStart);					
						}
					}	
				});
		
		/*
		 * Justice League Button
		 */
		jlMediaPlay = MediaPlayer.create( _context, R.raw.jltheme);
		//Set button
		jlTheme = (Button) findViewById(R.id.jlbttn);
		jlStart = "Play Justice League Theme";
		//start button 3 listener
		jlTheme.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View v2){

						//starting and stopping the audio
						if(jlStart.equals("Play Justice League Theme")){
							jlMediaPlay.start();
							jlStart = "Pause";
							jlTheme.setText(jlStart);
						}else {
							jlMediaPlay.pause();
							jlStart = "Play Justice League Theme";//changes text back to play
							jlTheme.setText(jlStart);					
						}
					}	
				});
		
		
		/*
		 * Justice League Unlimited Button
		 */
		jluMediaPlay = MediaPlayer.create( _context, R.raw.jlutheme);
		//Set button
		JLATheme = (Button) findViewById(R.id.JLAmbttn);
		jluStart = "Play Justice League Unlimited Theme";
		//start button 1 listener
		JLATheme.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View v3){

						//starting and stopping the audio
						if(jluStart.equals("Play Justice League Unlimited Theme")){
							jluMediaPlay.start();
							jluStart = "Pause";
							JLATheme.setText(jluStart);
						}else {
							jluMediaPlay.pause();
							jluStart = "Play Justice League Unlimited Theme";//changes text back to play
							JLATheme.setText(jlStart);					
						}
					}	
				});
		
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onDestroy()
	 */
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		mediaPlay.release();
		batMediaPlay.release();
		jlMediaPlay.release();
		jluMediaPlay.release();
	}



	/* (non-Javadoc)
	 * @see android.app.Activity#onPause()
	 */
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		mediaPlay.pause();
		batMediaPlay.pause();
		jlMediaPlay.pause();
		jluMediaPlay.pause();
	}



	/* (non-Javadoc)
	 * @see android.app.Activity#onStop()
	 */
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		mediaPlay.stop();
		batMediaPlay.stop();
		jlMediaPlay.stop();
		jluMediaPlay.stop();
	}
}
