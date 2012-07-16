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
	public static final String CALENDAR_SYMPTOMS 	= "";
	public static final String CALENDAR_DATE		= "";
	
	//Table PLOG
	public static final String TABLE_PLOG 			= "plog";
	public static final String PLOG_START_DATE	 	= "";
	public static final String PLOG_END_DATE	 	= "";
	public static final String PLOG_LENGTH			= "";
	
	//Table Reminders
	public static final String TABLE_REMINDERS		= "reminders";
	public static final String REMINDERS_DATE	 	= "";
	public static final String REMINDERS_REMINDER 	= "";
	public static final String REMINDERS_ALARM_DATE	= "";
	
	//Table Settings
	public static final String TABLE_SETTINGS 		= "settings";
	public static final String SETTINGS_PASS_ON_OFF	= "";
	public static final String SETTINGS_PASSWORD	= "";
	
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
