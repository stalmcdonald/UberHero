package com.cm.quiz;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.cm.uberhero.Question;

public class Database extends SQLiteOpenHelper{

	private static String DB_PATH = "/data/data/com.cm.uberhero/databases/";
	private static String DB_NAME = "questionsDb";
	private SQLiteDatabase uhDB; 
	@SuppressWarnings("unused")
	private final Context _context;

	public Database(Context c) {
		super(c, DB_NAME, null, 1);
		this._context = c;
	}

	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}	

	
}