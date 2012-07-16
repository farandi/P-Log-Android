package com.company2359.plog.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;

public class PlogContentProvider extends ContentProvider{
	
	private DatabaseHelper		dbHelper;
	
	public static final String 	TAG					="ContentProvider";   
	public static final String 	AUTHORITY 			="com.company2359.plog.provider";
	public static final String 	DATABASE_NAME 		="plog.db";
	public static final int 	DATABASE_VERSION 	= 1;

	//Table Calendar
	public static final String TABLE_CALENDAR 		= "calendar";
	public static final String CALENDAR_ID			= "_id";
	public static final String CALENDAR_SYMPTOMS 	= "symptoms";
	public static final String CALENDAR_DATE		= "date";
	public static final String TABLE_CALENDAR_CREATE = "CREATE TABLE " +
			TABLE_CALENDAR +" ("+ CALENDAR_ID 	+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
			CALENDAR_SYMPTOMS	+ " TEXT, "+
			CALENDAR_DATE		+ " DATE"
			+")";
	
	//Table PLOG
	public static final String TABLE_PLOG 			= "plog";
	public static final String PLOG_ID				= "_id";
	public static final String PLOG_START_DATE	 	= "start";
	public static final String PLOG_END_DATE	 	= "end";
	public static final String PLOG_LENGTH			= "length";
	public static final String TABLE_PLOG_CREATE	= "CREATE TABLE "+
			TABLE_PLOG +" ("+ PLOG_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, "+
			PLOG_START_DATE	+" DATE, "+
			PLOG_END_DATE	+" DATE, "+
			PLOG_LENGTH		+" INTEGER"+
			")";
	
	
	//Table Reminders
	public static final String TABLE_REMINDERS		= "reminders";
	public static final String REMINDERS_ID			= "_id";
	public static final String REMINDERS_DATE	 	= "date";
	public static final String REMINDERS_REMINDER 	= "note";
	public static final String REMINDERS_ALARM_DATE	= "alarm_date";
	public static final String TABLE_REMINDERS_CREATE = "CREATE TABLE "+
			TABLE_REMINDERS+" ("+REMINDERS_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
			REMINDERS_DATE		+" DATE, "+
			REMINDERS_REMINDER	+" TEXT, "+
			REMINDERS_ALARM_DATE+" DATE"+
			")";
	
	
	//Table Settings
	public static final String TABLE_SETTINGS 		= "settings";
	public static final String SETTINGS_ID			= "_id";
	public static final String SETTINGS_PASS_ON_OFF	= "toggle";
	public static final String SETTINGS_PASSWORD	= "password";
	
	
	
	private static class DatabaseHelper extends SQLiteOpenHelper{

		public DatabaseHelper(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public void onOpen(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			super.onOpen(db);
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	@Override
	public boolean onCreate() {
		// TODO Auto-generated method stub
		dbHelper = new DatabaseHelper(getContext());
		return true;
	}

	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getType(Uri uri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Uri insert(Uri uri, ContentValues values) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Cursor query(Uri uri, String[] projection, String selection,
			String[] selectionArgs, String sortOrder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Uri uri, ContentValues values, String selection,
			String[] selectionArgs) {
		// TODO Auto-generated method stub
		return 0;
	}

}
