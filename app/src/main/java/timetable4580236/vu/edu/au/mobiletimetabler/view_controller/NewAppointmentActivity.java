package timetable4580236.vu.edu.au.mobiletimetabler.view_controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import timetable4580236.vu.edu.au.mobiletimetabler.R;
import timetable4580236.vu.edu.au.mobiletimetabler.database.AppointmentDataSource;
import timetable4580236.vu.edu.au.mobiletimetabler.model.Appointment;


public class NewAppointmentActivity extends AppCompatActivity {

    public void goToMain(View view){
     finish();
    }

    public void createAppointment(View view){

        Appointment appointment = new Appointment();

        //todo : add if statement to check incase of user didn't choose any value.
        // Set Day
        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        int selectedid = radioGroup.getCheckedRadioButtonId();

        RadioButton radioButton = findViewById(selectedid);

        appointment.setDay(Integer.parseInt(radioButton.getTag().toString()));

        //Set Time
        EditText timeText = findViewById(R.id.editText);
        appointment.setTime(timeText.getText().toString());
        //set Duration
        EditText durationText = findViewById(R.id.editText2);
        appointment.setDuration(durationText.getText().toString());
        //set Description
        EditText descText = findViewById(R.id.editText3);
        appointment.setDescription(descText.getText().toString());

        // put appointment class to SQLiteDatabase.

        Log.i("Thisone", "user data saved into appointment class");
        AppointmentDataSource.insertAppointment(appointment);

        //Toast the result.

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_appointment);

    }
}
