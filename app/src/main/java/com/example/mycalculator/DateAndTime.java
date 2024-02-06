package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class DateAndTime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_and_time);


//        date picker
        DatePicker datePicker = findViewById(R.id.calenderdemo);
        Button subdateBtn = findViewById(R.id.subDate);
        TextView dateBox = findViewById(R.id.dateBox);

        subdateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = datePicker.getDayOfMonth() + "/" + datePicker.getMonth() + "/" + datePicker.getYear();
                dateBox.setText(data);
            }
        });


//        time picker


        TimePicker timePicker = findViewById(R.id.timePickerDemo);
        Button timePickerSubBtn = findViewById(R.id.timePickerSubBtn);
        TextView timeBox = findViewById(R.id.timeBox);


        timePickerSubBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data;
                String am_pm;
                int hour, minute;
                if(Build.VERSION.SDK_INT>=23)
                {
                    hour = timePicker.getHour();
                    minute = timePicker.getMinute();
                }
                else{
                    hour = timePicker.getCurrentHour();
                    minute = timePicker.getCurrentMinute();
                }

                if(hour>12)
                {
                    hour = hour-12;
                    am_pm = "PM";
                }
                else{
                    am_pm = "AM";
                }

                data = hour + ":" + minute + " " + am_pm;
                timeBox.setText(data);
            }
        });
    }
}