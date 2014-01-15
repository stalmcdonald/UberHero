/*
 * Android Developer: Crystal McDonald
 * App: UBERHERO
 * Date: January 2014
 * 
 * Information & Contact activity
 * 
 */
package com.cm.uberhero;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class InfoActivity extends Activity{
	final Context context = this;
	private ImageButton callbttn;
	private ImageButton mailbttn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info);
		
		callbttn = (ImageButton) findViewById(R.id.phonebttn);
		mailbttn = (ImageButton) findViewById(R.id.mailbttn);
		
		// add PhoneStateListener
		PhoneCallListener phoneListener = new PhoneCallListener();
		TelephonyManager telephonyManager = (TelephonyManager) this
			.getSystemService(Context.TELEPHONY_SERVICE);
		telephonyManager.listen(phoneListener,PhoneStateListener.LISTEN_CALL_STATE);
				
		//button listener for phone
		callbttn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// implicit phone intent
				Intent phoneIntent = new Intent(Intent.ACTION_CALL);
				phoneIntent.setData(Uri.parse("tel:5038932793"));
				startActivity(phoneIntent);
				
			}
			
		});
	
		//button listener for email
				mailbttn.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View mail) {			
				
		Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
	            "mailto","crystal@devboxpro.com", null));
	emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
	startActivity(Intent.createChooser(emailIntent, "Send email..."));
				}
				
	});
	
	}

	//monitor phone call activities
		private class PhoneCallListener extends PhoneStateListener {
	 
			private boolean isPhoneCalling = false;
	 
			String LOG_TAG = "LOGGING 5678";
	 
			@Override
			public void onCallStateChanged(int state, String incomingNumber) {
	 
				if (TelephonyManager.CALL_STATE_RINGING == state) {
					// phone ringing
					Log.i(LOG_TAG, "RINGING, number: " + incomingNumber);
				}
	 
				if (TelephonyManager.CALL_STATE_OFFHOOK == state) {
					// active
					Log.i(LOG_TAG, "OFFHOOK");
	 
					isPhoneCalling = true;
				}
	 
				if (TelephonyManager.CALL_STATE_IDLE == state) {
					// run when class initial and phone call ended, 
					// need detect flag from CALL_STATE_OFFHOOK
					Log.i(LOG_TAG, "IDLE");
	 
					if (isPhoneCalling) {
	 
						Log.i(LOG_TAG, "restart app");
	 
						// restart app
						Intent i = getBaseContext().getPackageManager()
							.getLaunchIntentForPackage(
								getBaseContext().getPackageName());
						i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
						startActivity(i);
	 
						isPhoneCalling = false;
					}
	 
				}
			}
		}
}
