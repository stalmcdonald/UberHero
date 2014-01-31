
package com.cm.uberhero;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.cm.logo.LogosActivity;


public class MainActivity extends Activity implements OnClickListener{
	Context _context;
	//checks network connection
	Boolean _connected = false;//want to assume not connected
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//buttons
//				Button playBtn = (Button) findViewById(R.id.startBttn);
//				playBtn.setOnClickListener(this);
//				Button settingsBtn = (Button) findViewById(R.id.changeBttn);
//				settingsBtn.setOnClickListener(this);

	}
		/*
		 * 		Quiz Menu
		 */
				//setup switch case for buttons
//				@Override
//				public void onClick(View v) {
//					Intent i;
//					
//					switch (v.getId()){
//					case R.id.startBttn:
						
						

		/*
		 *      Action Bar
		 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	//Boolean to find action bar items
		//Switch case
		@Override
		public boolean onOptionsItemSelected(MenuItem item){
			super.onOptionsItemSelected(item);
			switch(item.getItemId()){
			//action bar button found by id
			case R.id.author:
				aboutAuthor();
				break;
				
				//launching intent that displays info about app
			case R.id.aboutContact:
				Intent intent = new Intent(this, InfoActivity.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
				break;
				
			case R.id.superName:
				Intent superNameintent = new Intent(this, SuperNameActivity.class);
				superNameintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(superNameintent);
				break;
				
			case R.id.aboutHeroes:
				Intent aboutHerointent = new Intent(this, AboutHeroesActivity.class);
				aboutHerointent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(aboutHerointent);
				break;
				
			case R.id.rssFeed:
				
				Intent rssintent = new Intent(this, com.cm.rss.RssFeedActivity.class);
				rssintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(rssintent);
				
//				//Detects the network connection
//	      		_connected = com.cm.rss.ConnectionFile.getConnectionStatus(_context);
//	      		if(_connected){
//	      			Log.i("NETWORK CONNECTION ", com.cm.rss.ConnectionFile.getConnnectionType(_context));
//	      		}
    	  		
				break;
				
			case R.id.themeSongs:
				Intent themeintent = new Intent(this, ThemeSongActivity.class);
				themeintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(themeintent);
				break;
				
			case R.id.alterEgo:
				Intent alterIntent = new Intent(this, AlterEgoActivity.class);
				alterIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(alterIntent);
				break;
				
			case R.id.glossary:
				Intent glossaryIntent = new Intent(this, GlossaryActivity.class);
				glossaryIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(glossaryIntent);
				break;
				
			case R.id.logo:
				Intent logoIntent = new Intent(this, LogosActivity.class);
				logoIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(logoIntent);
				break;
				
			}
			return true;
		}//end onOptionsItemSelected

		
		//creating a method for actionbar item about Author in Alert Dialog 
		private void aboutAuthor() {
			// Shows alert with info about author
			new AlertDialog.Builder(this).setTitle("Android Developer")
			.setMessage("Crystal McDonald")
			.setNeutralButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			}).show();
		}
		
		
			

	@Override
	public void onClick(DialogInterface arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

}
