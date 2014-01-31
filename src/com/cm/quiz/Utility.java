/**
 * 
 */
package com.cm.quiz;

import java.util.List;

import com.cm.uberhero.Question;



public class Utility {
	
	

	//finds the answer for the question
	public static String getAnswers(List<Question> questions) {
		int question = 1;
		StringBuffer stringbuffer = new StringBuffer();
		
		for (Question q : questions){
			stringbuffer.append("Q").append(question).append(") ").append(q.getQuestion()).append("? \n");
			stringbuffer.append("Answer: ").append(q.getAnswer()).append("\n\n");
			question ++;
		}
		
		return stringbuffer.toString();
	}

}
