
package com.cm.quiz;


public class Score {

	//quiz score by percentage
		private static int getScore(int numCorrect, int numOfQuestions) {
			double frac = (double)numCorrect/(double)numOfQuestions;
			int percent = (int) (frac*100);
			return percent;
		}
		
	//shows a response based on players answers/score
	public static String showScoreResult(int numCorrect, int numberQuestions, int diff)
	{
		String result="";
		int percentage = getScore(numCorrect, numberQuestions);
		switch (diff)
		{
		case Constants.VILLAIN :
			if (percentage > 90){
				result = "You are a Supervillian!";
			}else if (percentage >= 70){
				result="You are a little evil";
			}else if (percentage >= 30){
				result="Ever thought of a career as a minion?";
			}else if (percentage >= 10){
				result="You are only Human";
			}else{
				result="You are definitely one of the good guys.";
			}
			break;
			
		case Constants.TRIVIA :
			if (percentage > 90){
				result = "You know your stuff!";
			}else if (percentage >= 80){
				result="You rock!";
			}else if (percentage >= 60){
				result="Good job";
			}else if (percentage >= 50){
				result="Don't stop believing";
			}else{
				result="Maybe you should spend more time reading comic books";
			}
			break;
			
		default:
			if (percentage > 95){
				result = "You are Superman!";
			}else if (percentage >= 90){
				result="You are Wonderwoman!";
			}else if (percentage >= 85){
				result="Your are Flash";
			}else if (percentage >= 30){
				result="You are Green Lantern.";
			}else{
				result="You are Batman";
			}
		}
		
		return result;
	}

}
