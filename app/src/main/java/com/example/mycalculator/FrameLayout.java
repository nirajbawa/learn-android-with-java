package com.example.mycalculator;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class FrameLayout extends AppCompatActivity {
    TextView t1, t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
        t1 = findViewById(R.id.text1);
        t2 = findViewById(R.id.text2);
    }
    public void changeText(View view)
    {
        if(t1.getVisibility()==View.VISIBLE)
        {
            t1.setVisibility(View.INVISIBLE);
            t2.setVisibility(View.VISIBLE);
        }
        else{
            t2.setVisibility(View.INVISIBLE);
            t1.setVisibility(View.VISIBLE);
        }
    }
}