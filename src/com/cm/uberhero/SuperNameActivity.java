package com.cm.uberhero;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SuperNameActivity extends Activity implements OnClickListener{
	EditText initials;
	TextView answers;
	 private Button b, legendBttn;
	protected Context Context;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.supername);

		//finding Views 
		answers = (TextView)findViewById(R.id.answerText);
		initials = (EditText)findViewById(R.id.et);
		final Button b = (Button)findViewById(R.id.nameBttn);
		final Button legendButton = (Button)findViewById(R.id.legendBttn);

		legendButton.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View legend) {
				Intent i = new Intent(getApplicationContext(), BatLegend.class);
				startActivity(i); 
		}

	 });
		b.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				//empty text condition
				if(initials.getText().equals("") || initials.getText().equals(null))  {
                    
//				if(!(initials.getText().toString().equalsIgnoreCase(""))){
//					Toast.makeText(getApplicationContext(),
//                            "Enter Initials.", Toast.LENGTH_LONG).show();
//				//checking for input
//				if(initials.getText().equals("")){
				//Show Toast Error Message
					CharSequence text = "Please Enter Initials";
		  			int duration = Toast.LENGTH_SHORT;
		  			Toast toast = Toast.makeText(Context, text, duration);
		  			toast.show();
		  			return;
				}else{
				 // this hides the keyboard after user selects the predict button
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        		   imm.hideSoftInputFromWindow(b.getWindowToken(), 0);

        		   // getting text edited and appending it to a string
				String string = initials.getText().toString();
				answers.setText("I'm Batman.");
				}
			}

		});
	}


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub

	}
}