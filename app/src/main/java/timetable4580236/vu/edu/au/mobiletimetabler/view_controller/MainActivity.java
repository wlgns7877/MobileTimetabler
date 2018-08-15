package timetable4580236.vu.edu.au.mobiletimetabler.view_controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import timetable4580236.vu.edu.au.mobiletimetabler.R;
import timetable4580236.vu.edu.au.mobiletimetabler.database.AppointmentDataSource;


public class MainActivity extends AppCompatActivity {

    AppointmentDataSource mAppointmentDataSource;

    public void createNewAppointment(View view){

        Intent intent = new Intent (getApplicationContext(), NewAppointmentActivity.class);
        startActivity(intent);

    }

    public void deleteAppointment(View view){

        Intent intent = new Intent (getApplicationContext(), DeleteAppointmentActivity.class);
        startActivity(intent);

    }


    public void populateSchedule() {

        // opens the database, retrieves all the saved appointments, and adds the text of those appointments to the timetableLayout displayed.

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAppointmentDataSource = new AppointmentDataSource(this);
        mAppointmentDataSource.open();
        Toast.makeText(this, "Database acquired!", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onPause(){
        super.onPause();
        mAppointmentDataSource.close();
    }

    @Override
    protected void onResume(){
        super.onResume();
        mAppointmentDataSource.open();
    }

}
