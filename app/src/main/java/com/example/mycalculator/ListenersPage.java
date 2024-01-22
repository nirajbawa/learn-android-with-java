package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ListenersPage extends AppCompatActivity implements View.OnClickListener{

    TextView btn1, btn2, btn3, btn4, btn5, btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listeners_page);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);

//        using anonymous class
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createMessage("btn1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createMessage("btn2");
            }
        });

        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn3) {
            createMessage("btn3");
        } else if (view.getId() == R.id.btn4) {
            createMessage("btn4");
        }
    }


    public void btn5(View view)
    {
        createMessage("btn5");
    }

    public void btn6(View view)
    {
        createMessage("btn6");
    }

    void createMessage(String msg)
    {
         Toast.makeText(ListenersPage.this, msg, Toast.LENGTH_SHORT).show();
    }
}