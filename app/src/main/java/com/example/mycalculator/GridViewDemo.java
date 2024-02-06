package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class GridViewDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        String cityNames[] = {"taloda", "nandurbar", "akkalkuwa", "mumbai", "banglore", "heydrabad"};

        GridView gridView = findViewById(R.id.girdView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(GridViewDemo.this, android.R.layout.simple_list_item_1, cityNames);
        gridView.setAdapter(arrayAdapter);
    }
}