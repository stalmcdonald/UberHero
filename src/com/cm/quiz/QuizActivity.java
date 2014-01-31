/**
 * 
 */
package com.cm.quiz;

import java.util.List;

import com.cm.uberhero.Question;
import com.cm.uberhero.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class QuizActivity extends Activity implements OnClickListener{

	private Question questionCurrent;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_question);
        

        Button nextBtn = (Button) findViewById(R.id.nextBtn);
		nextBtn.setOnClickListener(this);
        
       
    }


	


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	
}
