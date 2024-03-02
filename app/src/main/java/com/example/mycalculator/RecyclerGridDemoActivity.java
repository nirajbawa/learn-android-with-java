package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mycalculator.adapter.RecipeAdapter;
import com.example.mycalculator.model.RecipeModel;

import java.util.ArrayList;

public class RecyclerGridDemoActivity extends AppCompatActivity {
    RecyclerView recyclerViewGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_grid_demo);


        recyclerViewGrid = findViewById(R.id.itmesListGrid);


        ArrayList<RecipeModel> list = new ArrayList<>();

        list.add(new RecipeModel(R.drawable.card_bg, "masala maggi 1"));
        list.add(new RecipeModel(R.drawable.card_bg, "masala maggi 2"));
        list.add(new RecipeModel(R.drawable.card_bg, "masala maggi 3"));
        list.add(new RecipeModel(R.drawable.card_bg, "masala maggi 4"));
        RecipeAdapter adapter = new RecipeAdapter(list, this);

//        horizontal recycler view
        recyclerViewGrid.setAdapter(adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerViewGrid.setLayoutManager(gridLayoutManager);
    }
}