package timetable4580236.vu.edu.au.mobiletimetabler.view_controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import timetable4580236.vu.edu.au.mobiletimetabler.R;


public class NewAppointmentActivity extends AppCompatActivity {

    public void goToMain(View view){
     finish();
    }

    public void createAppointment(View view){

        // retrieve data from text view, and make new appointment class and put data in it.
        // put appointment class to SQLiteDatabase.
        //Toast the result.


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_appointment);
    }
}
