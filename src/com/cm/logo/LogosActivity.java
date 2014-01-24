package com.cm.logo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.cm.uberhero.R;

public class LogosActivity extends Activity implements OnClickListener{
	ImageButton aquamanBttn, batmanBttn, wonderwomanBttn, supermanBttn, 
	greenlanternBttn, flashBttn, manhunterBttn, beastboyBttn, cyborgBttn, 
	greenarrowBttn, robinBttn, shazamBttn, hawkgirlBttn, starfireBttn, 
	nightwingBttn, ravenBttn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.logo);


		//set up onclick listeners for buttons
		findViewById(R.id.aquamanBttn).setOnClickListener(this);
		findViewById(R.id.batmanBttn).setOnClickListener(this);
		findViewById(R.id.wonderwomanBttn).setOnClickListener(this);
		findViewById(R.id.supermanBttn).setOnClickListener(this);
		findViewById(R.id.greenlanternBttn).setOnClickListener(this);
		findViewById(R.id.flashBttn).setOnClickListener(this);
		findViewById(R.id.manhunterBttn).setOnClickListener(this);
		findViewById(R.id.beastboyBttn).setOnClickListener(this);
		findViewById(R.id.cyborgBttn).setOnClickListener(this);
		findViewById(R.id.greenarrowBttn).setOnClickListener(this);
		findViewById(R.id.robinBttn).setOnClickListener(this);
		findViewById(R.id.shazamBttn).setOnClickListener(this);
		findViewById(R.id.hawkgirlBttn).setOnClickListener(this);
		findViewById(R.id.starfireBttn).setOnClickListener(this);
		findViewById(R.id.nightwingBttn).setOnClickListener(this);
		findViewById(R.id.ravenBttn).setOnClickListener(this);
	
}

	@Override
	public void onClick(View v) {
		
		// setup switch case for buttons
				switch (v.getId()){
				
				case R.id.aquamanBttn:
					Intent aquaIntent = new Intent(this, com.cm.logo.AquamanVid.class);
					aquaIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(aquaIntent);
					break;
					
				case R.id.batmanBttn:
					Intent batIntent = new Intent(this, com.cm.logo.BatVid.class);
					batIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(batIntent);
					break;
					
				case R.id.wonderwomanBttn:
					Intent wwIntent = new Intent(this, com.cm.logo.WonderwomanVid.class);
					wwIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(wwIntent);
					break;
					
				case R.id.supermanBttn:
					Intent smIntent = new Intent(this, com.cm.logo.SupermanVid.class);
					smIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(smIntent);
					break;
					
				case R.id.flashBttn:
					Intent flashIntent = new Intent(this, com.cm.logo.FlashVid.class);
					flashIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(flashIntent);
					break;
					
				case R.id.greenlanternBttn:
					Intent greenIntent = new Intent(this, com.cm.logo.GreenlanternVid.class);
					greenIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(greenIntent);
					break;
					
				case R.id.manhunterBttn:
					Intent mmIntent = new Intent(this, com.cm.logo.MartianVid.class);
					mmIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(mmIntent);
					break;
					
				case R.id.beastboyBttn:
					Intent bbIntent = new Intent(this, com.cm.logo.BeastboyVid.class);
					bbIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(bbIntent);
					break;
					
				case R.id.cyborgBttn:
					Intent cyIntent = new Intent(this, com.cm.logo.CyborgVid.class);
					cyIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(cyIntent);
					break;
					
				case R.id.greenarrowBttn:
					Intent gaIntent = new Intent(this, com.cm.logo.GreenArrowVid.class);
					gaIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(gaIntent);
					break;
					
				case R.id.robinBttn:
					Intent robIntent = new Intent(this, com.cm.logo.RobinVid.class);
					robIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(robIntent);
					break;
					
				case R.id.shazamBttn:
					Intent shazIntent = new Intent(this, com.cm.logo.ShazamVid.class);
					shazIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(shazIntent);
					break;
					
				case R.id.hawkgirlBttn:
					Intent hgIntent = new Intent(this, com.cm.logo.HawkgirlVid.class);
					hgIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(hgIntent);
					break;
					
				case R.id.starfireBttn:
					Intent sfIntent = new Intent(this, com.cm.logo.StarFireVid.class);
					sfIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(sfIntent);
					break;	
					
				case R.id.nightwingBttn:
					Intent ngIntent = new Intent(this, com.cm.logo.NightwingVid.class);
					ngIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(ngIntent);
					break;
					
				case R.id.ravenBttn:
					Intent raveIntent = new Intent(this, com.cm.logo.RavenVid.class);
					raveIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(raveIntent);
					break;	
				}
	}// end onclick

}//end