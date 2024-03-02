package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.mycalculator.adapter.RecipeAdapter;
import com.example.mycalculator.model.RecipeModel;

import java.util.ArrayList;

public class RecyclerStaggeredLayoutManagerActivity extends AppCompatActivity {
    RecyclerView recyclerViewStaggered;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_staggered_layout_manager);

        recyclerViewStaggered = findViewById(R.id.itmesListStaggered);


        ArrayList<RecipeModel> list = new ArrayList<>();

        list.add(new RecipeModel(R.drawable.card_bg, "masala maggi 1"));
        list.add(new RecipeModel(R.drawable.card_bg, "masala maggi 2"));
        list.add(new RecipeModel(R.drawable.card_bg, "masala maggi 3"));
        list.add(new RecipeModel(R.drawable.card_bg, "masala maggi 4"));
        list.add(new RecipeModel(R.drawable.card_bg, "masala maggi 5"));
        list.add(new RecipeModel(R.drawable.card_bg, "masala maggi 6"));
        list.add(new RecipeModel(R.drawable.card_bg, "masala maggi 7"));
        list.add(new RecipeModel(R.drawable.card_bg, "masala maggi 8"));
        RecipeAdapter adapter = new RecipeAdapter(list, this);
        recyclerViewStaggered.setAdapter(adapter);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL);
        recyclerViewStaggered.setLayoutManager(staggeredGridLayoutManager);
    }
}