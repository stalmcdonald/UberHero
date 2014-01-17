package com.cm.uberhero;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class GlossaryActivity extends Activity{
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.glossary);
		
		TextView tView = (TextView) findViewById(R.id.glossText);
		tView.setSelected(true);
	}
	
}
