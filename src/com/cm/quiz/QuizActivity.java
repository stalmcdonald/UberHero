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
        
        showQues();
		
    }


	//getting the text for quiz
	private void showQues() {
		//Question
		String question = (questionCurrent.getQuestion()) + "?";
        TextView qText = (TextView) findViewById(R.id.question);
        qText.setText(question);
        
        //answers
        List<String> answers = questionCurrent.getQuestionOptions();
        TextView answrA = (TextView) findViewById(R.id.rbA);
        answrA.setText(answers.get(0));
        
        TextView answrB = (TextView) findViewById(R.id.rbB);
        answrB.setText(answers.get(1));
        
        TextView answrC = (TextView) findViewById(R.id.rbC);
        answrC.setText(answers.get(2));
        
        TextView answrD = (TextView) findViewById(R.id.rbD);
        answrD.setText(answers.get(3));
	}
	
	
    

	


	private String getAnswers() {
		RadioButton rbA = (RadioButton)findViewById(R.id.rbA);
		RadioButton rbB = (RadioButton)findViewById(R.id.rbB);
		RadioButton rbC = (RadioButton)findViewById(R.id.rbC);
		RadioButton rbD = (RadioButton)findViewById(R.id.rbD);
		if (rbA.isChecked())
		{
			return rbA.getText().toString();
		}
		if (rbB.isChecked())
		{
			return rbB.getText().toString();
		}
		if (rbC.isChecked())
		{
			return rbC.getText().toString();
		}
		if (rbD.isChecked())
		{
			return rbD.getText().toString();
		}
		
		return null;
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	
}
