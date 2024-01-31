package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class CustomFonts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_fonts);

        TextView t1, t2, t3;
        t1 = findViewById(R.id.t1);
        Typeface hindiFont = Typeface.createFromAsset(getAssets(), "fonts/hindi.ttf");
        t1.setTypeface(hindiFont);

        t2 = findViewById(R.id.t2);
        Typeface urdu = Typeface.createFromAsset(getAssets(), "fonts/urdu.ttf");
        t2.setTypeface(urdu);

        t2 = findViewById(R.id.t3);
        Typeface english = Typeface.createFromAsset(getAssets(), "fonts/english.ttf");
        t2.setTypeface(english);
    }
}