package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mycalculator.adapter.RecipeAdapter;
import com.example.mycalculator.model.RecipeModel;

import java.util.ArrayList;

public class RecyclerHorizontalDemoActivity extends AppCompatActivity {
    RecyclerView recyclerViewHorizaontal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_horizontal_demo);


        recyclerViewHorizaontal = findViewById(R.id.itmesListHorizontal);


        ArrayList<RecipeModel> list = new ArrayList<>();

        list.add(new RecipeModel(R.drawable.card_bg, "masala maggi 1"));
        list.add(new RecipeModel(R.drawable.card_bg, "masala maggi 2"));
        list.add(new RecipeModel(R.drawable.card_bg, "masala maggi 3"));
        RecipeAdapter adapter = new RecipeAdapter(list, this);

//        horizontal recycler view
        recyclerViewHorizaontal.setAdapter(adapter);
        LinearLayoutManager linearLayoutManagerHorizontal = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewHorizaontal.setLayoutManager(linearLayoutManagerHorizontal);

    }
}