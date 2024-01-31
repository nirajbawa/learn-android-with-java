package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class IntentTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_test);

        TextView t2;
        t2 = findViewById(R.id.text2);

        Intent intent = getIntent();
        String data = intent.getStringExtra("data");

        t2.setText(data);

    }
}