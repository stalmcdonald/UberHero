package com.cm.uberhero;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class AlterEgoActivity extends Activity implements OnClickListener{
	
	
	ImageButton greenarrowBttn, greenlanternBttn, supermanBttn, manhunterBttn, 
	flashBttn, robinBttn, wonderwomanBttn, hawkgirlBttn, starfireBttn, beastboyBttn, 
	cyborgBttn, batmanBttn, aquamanBttn, shazamBttn, nightwingBttn, ravenBttn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alter);
		
		//set up onclick listeners for buttons
		findViewById(R.id.greenarrowBttn).setOnClickListener(this);
		findViewById(R.id.greenlanternBttn).setOnClickListener(this);
		findViewById(R.id.supermanBttn).setOnClickListener(this);
		findViewById(R.id.manhunterBttn).setOnClickListener(this);
		findViewById(R.id.flashBttn).setOnClickListener(this);
		findViewById(R.id.robinBttn).setOnClickListener(this);
		findViewById(R.id.wonderwomanBttn).setOnClickListener(this);
		findViewById(R.id.hawkgirlBttn).setOnClickListener(this);
		findViewById(R.id.starfireBttn).setOnClickListener(this);
		findViewById(R.id.beastboyBttn).setOnClickListener(this);
		findViewById(R.id.cyborgBttn).setOnClickListener(this);
		findViewById(R.id.batmanBttn).setOnClickListener(this);
		findViewById(R.id.aquamanBttn).setOnClickListener(this);
		findViewById(R.id.shazamBttn).setOnClickListener(this);
		findViewById(R.id.nightwingBttn).setOnClickListener(this);
		findViewById(R.id.ravenBttn).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		
		// setup switch case for buttons
		switch (v.getId()){
		
		case R.id.greenarrowBttn:
			aboutGreenArrow();
			break;
			
		case R.id.greenlanternBttn:
			aboutGreenLantern();
			break;
			
		case R.id.supermanBttn:
			aboutSuperman();
			break;
			
		case R.id.manhunterBttn:
			aboutManHunter();
			break;
		case R.id.flashBttn:
			aboutFlash();
			break;
			
		case R.id.robinBttn:
			aboutRobin();
			break;
			
		case R.id.wonderwomanBttn:
			aboutWonderWoman();
			break;
			
		case R.id.hawkgirlBttn:
			aboutHawkGirl();
			break;
			
		case R.id.starfireBttn:
			aboutStarFire();
			break;
			
		case R.id.beastboyBttn:
			aboutBeastBoy();
			break;
			
		case R.id.cyborgBttn:
			aboutCyborg();
			break;
			
		case R.id.batmanBttn:
			aboutBatMan();
			break;
		case R.id.aquamanBttn:
			aboutAquaMan();
			break;
			
		case R.id.shazamBttn:
			aboutShazam();
			break;
			
		case R.id.nightwingBttn:
			aboutNightWing();
			break;
			
		case R.id.ravenBttn:
			aboutRaven();
			break;
		}
		
	}

	/*
	 * Dialogs
	 */
	
	//About Green Lantern
	//creating a method for Dialog to share info on Superhero Alter Egos
	private void aboutGreenArrow() {
		// Shows alert with info about Superhero
		new AlertDialog.Builder(this).setTitle("Green Arrow is :")
			.setMessage("Oliver Queen")
			.setNeutralButton("OK",new DialogInterface.OnClickListener() {
					
				@Override
				public void onClick(DialogInterface dialog, int which) {
				}
		}).show();
	}
			
	//About Green Lantern
	//creating a method for Dialog to share info on Superhero Alter Egos
	private void aboutGreenLantern() {
		// Shows alert with info about Superhero
		new AlertDialog.Builder(this).setTitle("Green Lantern is :")
			.setMessage("Hal Jordan")
			.setNeutralButton("OK",new DialogInterface.OnClickListener() {
							
				@Override
				public void onClick(DialogInterface dialog, int which) {
								
				}
		}).show();
	}
					
	//About Superman
	//creating a method for Dialog to share info on Superhero Alter Egos
	private void aboutSuperman() {
		// Shows alert with info about Superhero
		new AlertDialog.Builder(this).setTitle("Superman is :")
			.setMessage("Clark Kent")
			.setNeutralButton("OK",new DialogInterface.OnClickListener() {
									
				@Override
				public void onClick(DialogInterface dialog, int which) {
										
				}
		}).show();
	}
					
	//About Martian ManHunter
	//creating a method for Dialog to share info on Superhero Alter Egos
	private void aboutManHunter() {
		// Shows alert with info about Superhero
		new AlertDialog.Builder(this).setTitle("Martian Manhunter is :")
			.setMessage("J'onn J'onzz")
			.setNeutralButton("OK",new DialogInterface.OnClickListener() {
																
				@Override
				public void onClick(DialogInterface dialog, int which) {
				}
		}).show();
	}
						

	//About Flash
	//creating a method for Dialog to share info on Superhero Alter Egos
	private void aboutFlash() {
		// Shows alert with info about Superhero
		new AlertDialog.Builder(this).setTitle("Flash is :")
			.setMessage("Wally West")
			.setNeutralButton("OK",new DialogInterface.OnClickListener() {
													
				@Override
				public void onClick(DialogInterface dialog, int which) {
				}
		}).show();
	}
					
	//About Robin
	//creating a method for Dialog to share info on Superhero Alter Egos
	private void aboutRobin() {
		// Shows alert with info about Superhero
		new AlertDialog.Builder(this).setTitle("Robin was:")
			.setMessage("Damian Wayne 2013 | Currently Vacant ")
			.setNeutralButton("OK",new DialogInterface.OnClickListener() {
													
				@Override
				public void onClick(DialogInterface dialog, int which) {
				}
		}).show();
	}

	//About Wonderwoman
	//creating a method for Dialog to share info on Superhero Alter Egos
	private void aboutWonderWoman() {
		// Shows alert with info about Superhero
		new AlertDialog.Builder(this).setTitle("Wonder Woman is :")
			.setMessage("Princess Diana of Themyscira")
			.setNeutralButton("OK",new DialogInterface.OnClickListener() {
											
				@Override
				public void onClick(DialogInterface dialog, int which) {
												
				}
		}).show();
	}	
						   
	//About Hawkgirl
	//creating a method for Dialog to share info on Superhero Alter Egos
	private void aboutHawkGirl() {
		// Shows alert with info about Superhero
		new AlertDialog.Builder(this).setTitle("Hawk Girl is :")
			.setMessage("Shiera Sanders Hall")
			.setNeutralButton("OK",new DialogInterface.OnClickListener() {
																		
				@Override
				public void onClick(DialogInterface dialog, int which) {
				}
		}).show();
	}
	
	//About Star Fire
	//creating a method for Dialog to share info on Superhero Alter Egos
	private void aboutStarFire() {
		// Shows alert with info about Superhero
		new AlertDialog.Builder(this).setTitle("Star Fire is :")
			.setMessage("Koriand'r")
			.setNeutralButton("OK",new DialogInterface.OnClickListener() {
																			
				@Override
				public void onClick(DialogInterface dialog, int which) {
				}
		}).show();
	}
	
	//About Beast Boy
	//creating a method for Dialog to share info on Superhero Alter Egos
	private void aboutBeastBoy() {
		// Shows alert with info about Superhero
		new AlertDialog.Builder(this).setTitle("Beast Boy is :")
			.setMessage("Garfield Mark \"Gar\" Logan")
			.setNeutralButton("OK",new DialogInterface.OnClickListener() {
																				
				@Override
				public void onClick(DialogInterface dialog, int which) {
				}
		}).show();
	}
	
	//About Cyborg
	//creating a method for Dialog to share info on Superhero Alter Egos
	private void aboutCyborg() {
		// Shows alert with info about Superhero
		new AlertDialog.Builder(this).setTitle("Cyborg is :")
			.setMessage("Victor Stone")
			.setNeutralButton("OK",new DialogInterface.OnClickListener() {
																					
				@Override
				public void onClick(DialogInterface dialog, int which) {
				}
		}).show();
	}
	
	//About Batman
	//creating a method for Dialog to share info on Superhero Alter Egos
	private void aboutBatMan() {
		// Shows alert with info about Superhero
		new AlertDialog.Builder(this).setTitle("Batman is :")
			.setMessage("Bruce Wayne")
			.setNeutralButton("OK",new DialogInterface.OnClickListener() {
																					
				@Override
				public void onClick(DialogInterface dialog, int which) {
				}
		}).show();
	}	
	
	//About Aquaman
	//creating a method for Dialog to share info on Superhero Alter Egos
	private void aboutAquaMan() {
		// Shows alert with info about Superhero
		new AlertDialog.Builder(this).setTitle("Aquaman is :")
			.setMessage("Arthur Curry")
			.setNeutralButton("OK",new DialogInterface.OnClickListener() {
																						
				@Override
				public void onClick(DialogInterface dialog, int which) {
				}
		}).show();
	}
	
	//About Shazam
	//creating a method for Dialog to share info on Superhero Alter Egos
	private void aboutShazam() {
		// Shows alert with info about Superhero
		new AlertDialog.Builder(this).setTitle("Shazam is :")
			.setMessage("Billy Baston")
			.setNeutralButton("OK",new DialogInterface.OnClickListener() {
																							
				@Override
				public void onClick(DialogInterface dialog, int which) {
				}
		}).show();
	}
	
	//About Shazam
	//creating a method for Dialog to share info on Superhero Alter Egos
	private void aboutNightWing() {
		// Shows alert with info about Superhero
		new AlertDialog.Builder(this).setTitle("Nightwing is :")
			.setMessage("Dick Grayson")
			.setNeutralButton("OK",new DialogInterface.OnClickListener() {
																								
				@Override
				public void onClick(DialogInterface dialog, int which) {
				}
		}).show();
	}
	
	//About Raven
	//creating a method for Dialog to share info on Superhero Alter Egos
	private void aboutRaven() {
		// Shows alert with info about Superhero
		new AlertDialog.Builder(this).setTitle("Raven is :")
			.setMessage("Raven Azarath")
			.setNeutralButton("OK",new DialogInterface.OnClickListener() {
																									
				@Override
				public void onClick(DialogInterface dialog, int which) {
				}
		}).show();
	}
	
}//end
