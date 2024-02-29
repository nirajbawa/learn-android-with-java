package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class BasicViews extends AppCompatActivity {
    String selectedCheckBox = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_views2);
        ToggleButton toggleButton = findViewById(R.id.btnToogle);



//        toggle button
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked)
                {
                    Toast.makeText(getApplicationContext(), "btn is checked : "+ compoundButton.getText().toString(), Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "btn is not checked" + compoundButton.getText().toString(), Toast.LENGTH_LONG).show();
                }
            }
        });



//        radio button

        final String[] selectedRadio = new String[1];
        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton rBtn = findViewById(i);
                selectedRadio[0] = rBtn.getText().toString();

                Toast.makeText(getApplicationContext(), "selected text : "+ selectedRadio[0], Toast.LENGTH_LONG).show();
            }
        });


//        checkbox button

        Button subCheckBtn = findViewById(R.id.subCheckBtn);

        CheckBox hindi, english, marathi;

        hindi = findViewById(R.id.hindi);
        english = findViewById(R.id.english);
        marathi = findViewById(R.id.marathi);


        subCheckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hindi.isChecked()){
                    selectedCheckBox += "\n" + hindi.getText().toString();
                } else if (marathi.isChecked()) {
                    selectedCheckBox += "\n" + marathi.getText().toString();
                } else if (english.isChecked()) {
                    selectedCheckBox += "\n" + english.getText().toString();
                }

                Toast.makeText(getApplicationContext(), selectedCheckBox, Toast.LENGTH_LONG).show();
            }
        });


//        process bar

        ProgressBar pBar = findViewById(R.id.progessHori);
        ProgressBar pBarLoading = findViewById(R.id.progessLoading);
        Button progressBtn = findViewById(R.id.progessHoriBtn);

        progressBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int i = 0;
                        while (i<=100)
                        {
                            pBar.setProgress(i);
                            pBarLoading.setProgress(i);
                            try {
                                Thread.sleep(5);
                            }
                            catch (Exception e)
                            {

                            }
                            i++;
                        }
                    }
                }).start();
            }
        });


    }
}