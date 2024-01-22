package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    TextView num1, num2, ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        ans = findViewById((R.id.ans));

        Button b1, b2, b3, b4, nextPage, tostsPage, linearLayoutPage, relativeLayoutPage, constraintLayout, frameLayout, absoluteLayout, tableLayout, toolbar;
        b1 = findViewById(R.id.add);
        b2 = findViewById(R.id.sub);
        b3 = findViewById(R.id.mul);
        b4 = findViewById(R.id.div);
        nextPage = findViewById(R.id.listeners_page);
        tostsPage = findViewById(R.id.TostsPage);
        linearLayoutPage = findViewById(R.id.linearLayoutPage);
        relativeLayoutPage = findViewById(R.id.relativeLayoutPage);
        constraintLayout = findViewById(R.id.constraintLayout);
        frameLayout = findViewById(R.id.frameLayout);
        absoluteLayout = findViewById(R.id.absoluteLayout);
        tableLayout = findViewById(R.id.tableLayout);
        toolbar = findViewById(R.id.toolbar);


        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ToolbarActivity.class);
                startActivity(intent);
            }
        });

        tableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TableLayout.class);
                startActivity(intent);
            }
        });

        absoluteLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, absoluteLayout.class);
                startActivity(intent);
            }
        });

        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FrameLayout.class);
                startActivity(intent);
            }
        });

        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, constraint_layout.class);
                startActivity(intent);
            }
        });

        relativeLayoutPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RelativeLayout.class);
                startActivity(intent);
            }
        });

        linearLayoutPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, linear_layout.class);
                startActivity(intent);
            }
        });

        nextPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent listeners_page = new Intent(MainActivity.this, ListenersPage.class);
                startActivity(listeners_page);
            }
        });

        tostsPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tostsPage = new Intent(MainActivity.this, Tosts.class);
                startActivity(tostsPage);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ans = Integer.parseInt(num1.getText().toString())+ Integer.parseInt(num2.getText().toString());
                setAnswer(Integer.toString(ans));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ans =  Integer.parseInt(num1.getText().toString())-Integer.parseInt(num2.getText().toString());
                setAnswer(Integer.toString(ans));
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ans =  Integer.parseInt(num1.getText().toString())*Integer.parseInt(num2.getText().toString());
                setAnswer(Integer.toString(ans));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float ans =  Float.parseFloat(num1.getText().toString())/Float.parseFloat(num2.getText().toString());
                setAnswer(Float.toString(ans));
            }
        });
    }

    void setAnswer(String ans){
        this.ans.setText(ans);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "destroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "restart", Toast.LENGTH_SHORT).show();
    }
}