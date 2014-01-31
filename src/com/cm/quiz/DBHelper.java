package com.cm.quiz;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.cm.uberhero.Question;

public class DBHelper extends SQLiteOpenHelper{

	private static String DB_PATH = "/data/data/com.cm.uberhero/databases/";
	private static String DB_NAME = "questionsDb";
	private SQLiteDatabase uhDB; 
	@SuppressWarnings("unused")
	private final Context _context;

	public DBHelper(Context c) {
		super(c, DB_NAME, null, 1);
		this._context = c;
	}	

	@Override
	public void onCreate(SQLiteDatabase db) {
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}


	public void openDB() throws SQLException{
		//Open the database
		String uhPath = DB_PATH + DB_NAME;
		uhDB = SQLiteDatabase.openDatabase(uhPath, null, SQLiteDatabase.OPEN_READONLY);
	}

	
	//make the questions random
	public List<Question> getQuizQues(int quiz, int numQ){
		List<Question> quizQues = new ArrayList<Question>();
		Cursor cursor = uhDB.rawQuery("SELECT * FROM QUESTIONS WHERE DIFFICULTY=" + quiz +
				" ORDER BY RANDOM() LIMIT " + numQ, null);
		while (cursor.moveToNext()){;
			Question q = new Question();
			q.setQuestion(cursor.getString(1));
			q.setAnswer(cursor.getString(2));
			q.showRbA(cursor.getString(3));
			q.showRbB(cursor.getString(4));
			q.showRbC(cursor.getString(5));
			q.showScores(quiz);
			quizQues.add(q);
		}
		return quizQues;
	}
}