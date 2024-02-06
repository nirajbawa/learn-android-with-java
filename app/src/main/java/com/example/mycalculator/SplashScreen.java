package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Thread bgThread = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep(5000);
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
                finally {
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        bgThread.start();
    }
}