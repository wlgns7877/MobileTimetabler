package timetable4580236.vu.edu.au.mobiletimetabler.view_controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import timetable4580236.vu.edu.au.mobiletimetabler.R;

public class DeleteAppointmentActivity extends AppCompatActivity {

    public void goToMain(View view){
        finish();
    }

    public void onDeleteRadioButtonClicked(View view){

    }

    public void populateAppointmentCheckboxes(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_appointment);
    }
}
