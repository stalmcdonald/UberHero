package com.cm.uberhero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {
	
	private String question;
	private String answer;
	private String a;
	private String b;
	private String c;
	private int score;
	
	//question
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	//answer
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	//scores
	public int getScores() {
		return score;
	}
	public void showScores(int rating) {
		this.score = rating;
	}
	
	//Radio Button A
	public String getRbA() {
		return a;
	}
	public void showRbA(String a) {
		this.a = a;
	}
	
	//RadioButton B
	public String getRbB() {
		return b;
	}
	public void showRbB(String b) {
		this.b = b;
	}
   //RadioButton C
	public String getRbC() {
		return c;
	}
	public void showRbC(String c) {
		this.c = c;
	}
	
	public List<String> getQuestionOptions(){
		List<String> shuffle = new ArrayList<String>();
		shuffle.add(answer);
		shuffle.add(a);
		shuffle.add(b);
		shuffle.add(c);
		Collections.shuffle(shuffle);
		return shuffle;
	}

	


}
