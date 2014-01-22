package com.cm.uberhero;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class AboutHeroesActivity extends Activity implements OnClickListener{
	ImageButton aquamanBttn, batmanBttn, wonderwomanBttn, supermanBttn, greenlanternBttn, flashBttn, manhunterBttn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.abouthero);


		//set up onclick listeners for buttons
		findViewById(R.id.aquamanBttn).setOnClickListener(this);
		findViewById(R.id.batmanBttn).setOnClickListener(this);
		findViewById(R.id.wonderwomanBttn).setOnClickListener(this);
		findViewById(R.id.supermanBttn).setOnClickListener(this);
		findViewById(R.id.greenlanternBttn).setOnClickListener(this);
		findViewById(R.id.flashBttn).setOnClickListener(this);
		findViewById(R.id.manhunterBttn).setOnClickListener(this);
}

	@Override
	public void onClick(View v) {
		
		// setup switch case for buttons
				switch (v.getId()){
				
				case R.id.aquamanBttn:
					Intent aquaIntent = new Intent(this, com.cm.abouthero.AquamanActivity.class);
					aquaIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(aquaIntent);
					break;
					
				case R.id.batmanBttn:
					Intent batIntent = new Intent(this, com.cm.abouthero.BatmanActivity.class);
					batIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(batIntent);
					break;
					
				case R.id.wonderwomanBttn:
					Intent wwIntent = new Intent(this, com.cm.abouthero.WonderWomanActivity.class);
					wwIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(wwIntent);
					break;
					
				case R.id.supermanBttn:
					Intent smIntent = new Intent(this, com.cm.abouthero.SupermanActivity.class);
					smIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(smIntent);
					break;
					
				case R.id.flashBttn:
					Intent flashIntent = new Intent(this, com.cm.abouthero.FlashActivity.class);
					flashIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(flashIntent);
					break;
					
				case R.id.manhunterBttn:
					Intent mmIntent = new Intent(this, com.cm.abouthero.MartianMHActivity.class);
					mmIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(mmIntent);
					break;
				}
	}// end onclick

}//end