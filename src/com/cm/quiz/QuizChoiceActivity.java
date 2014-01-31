package com.cm.quiz;

import com.cm.uberhero.R;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;


public class QuizChoiceActivity extends Activity implements OnClickListener{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_menu);
        
        //buttons
        Button changeQuizBttn = (Button) findViewById(R.id.nextBtn);
		changeQuizBttn.setOnClickListener(this);

		updateButtonWithPreferences();
		
    }
    
  //default quiz and getting new quiz selection
  	private void updateButtonWithPreferences() {
  		RadioButton rbA = (RadioButton)findViewById(R.id.superQuiz);
  		RadioButton rbB = (RadioButton)findViewById(R.id.triviaQuiz);
  		RadioButton rbC = (RadioButton)findViewById(R.id.villainQuiz);
  		
  		SharedPreferences quiz = getSharedPreferences(Constants.QUIZ, 0);
  		int selection = quiz.getInt(Constants.CHOICES, Constants.TRIVIA);
  		
  		switch (selection)
  		{
  		case Constants.SUPERHERO : 
  			rbA.toggle();
  			break;
  			
  		case Constants.TRIVIA : 
  			rbB.toggle();
  			break;
  			
  		case Constants.VILLAIN :
  			rbC.toggle();
  			break;	
  		}
  	}
  	
  	@Override
	public void onClick(View quiz) {
		//game choice 
		if (!rbChecked())
		{
			return;
		}
		else
		{
			SharedPreferences settings = getSharedPreferences(Constants.QUIZ, 0);
			Editor editor = settings.edit();
			editor.putInt(Constants.CHOICES, getQuizChoice());
			editor.commit();
			finish();
		}	
	}

  //which radiobutton selected
  	private boolean rbChecked() {
  		RadioButton rbA = (RadioButton)findViewById(R.id.superQuiz);
  		RadioButton rbB = (RadioButton)findViewById(R.id.triviaQuiz);
  		RadioButton rbC = (RadioButton)findViewById(R.id.villainQuiz);
  		return (rbA.isChecked() || rbB.isChecked() || rbC.isChecked());
  	}


  	//get the quiz that is chosen
  	private int getQuizChoice() {
  		RadioButton rbA = (RadioButton)findViewById(R.id.superQuiz);
  		RadioButton rbB = (RadioButton)findViewById(R.id.triviaQuiz);
  		if (rbA.isChecked())
  		{
  			return Constants.SUPERHERO;
  		}
  		if (rbB.isChecked())
  		{
  			return Constants.TRIVIA;
  		}
  		
  		return Constants.VILLAIN;
  	}
  	
	
}
