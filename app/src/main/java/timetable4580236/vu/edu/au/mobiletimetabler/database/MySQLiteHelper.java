package timetable4580236.vu.edu.au.mobiletimetabler.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class MySQLiteHelper extends SQLiteOpenHelper{

    public static final String TABLE_APPOINTMENTS = "appointments";
    public static final String COLUMN_ID = "id INT PRIMARY KEY";
    public static final String COLUMN_DAY = "day INT NOT NULL";
    public static final String COLUMN_TIME = "time VARCHAR NOT NULL";
    public static final String COLUMN_DURATION = "duration VARCHAR NOT NULL";
    public static final String COLUMN_DESCRIPTION = "description VARCHAR NOT NULL";
    public static final String DATABASE_NAME = "appointments.db";
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_CREATE = "CREATE TABLE IF NOT EXISTS " + TABLE_APPOINTMENTS + " (" + COLUMN_ID + ", " + COLUMN_DAY + ", " + COLUMN_TIME + ", " + COLUMN_DURATION  + ", " + COLUMN_DESCRIPTION + ")";

    public MySQLiteHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override public void onCreate(SQLiteDatabase db){
        db.execSQL(DATABASE_CREATE);

    }

    @Override public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_APPOINTMENTS);
        onCreate(db);
    }




}
