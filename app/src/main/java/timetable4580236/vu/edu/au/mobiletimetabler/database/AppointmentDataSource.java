package timetable4580236.vu.edu.au.mobiletimetabler.database;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;

import timetable4580236.vu.edu.au.mobiletimetabler.model.Appointment;

public class AppointmentDataSource {

 //   private Context mContext;
    private SQLiteDatabase mDatabase;
    MySQLiteHelper mDbHelper;
    public static final String[] ALL_COLUMNS =
            {MySQLiteHelper.COLUMN_DAY,MySQLiteHelper.COLUMN_TIME,MySQLiteHelper.COLUMN_DESCRIPTION,MySQLiteHelper.COLUMN_DURATION,};

    public AppointmentDataSource(Context context){
        Context mContext = context;
        mDbHelper = new MySQLiteHelper(mContext);
        mDatabase = mDbHelper.getWritableDatabase();
    }

    public void open(){
        mDatabase = mDbHelper.getWritableDatabase();
    }

    public void close(){
        mDbHelper.close();
    }

    public void insertAppointment(Appointment appointment){

        ContentValues values = new ContentValues(5);

        values.put(MySQLiteHelper.COLUMN_DAY, appointment.getDay());
        values.put(MySQLiteHelper.COLUMN_TIME, appointment.getTime());
        values.put(MySQLiteHelper.COLUMN_DESCRIPTION, appointment.getDescription());
        values.put(MySQLiteHelper.COLUMN_DURATION, appointment.getDuration());

        mDatabase.insert(MySQLiteHelper.TABLE_APPOINTMENTS, null, values);




    }
/*
    public void deleteAppointment(List<Long>){

    }

    public List<Appointment> getAllAppointments(){

    }

    //Not sure for cursor one, below
    Cursor cursorToAppointment;


*/



}
