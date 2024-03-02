package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mycalculator.adapter.RecipeAdapter;
import com.example.mycalculator.classes.RecyclerItemClickListener;
import com.example.mycalculator.model.RecipeModel;

import java.util.ArrayList;

public class RecyclerViewDemoActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_demo);

        recyclerView = findViewById(R.id.itmesList);

        ArrayList<RecipeModel> list = new ArrayList<>();

        list.add(new RecipeModel(R.drawable.card_bg, "masala maggi 1"));
        list.add(new RecipeModel(R.drawable.card_bg, "masala maggi 2"));
        list.add(new RecipeModel(R.drawable.card_bg, "masala maggi 3"));

        RecipeAdapter adapter = new RecipeAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Toast.makeText(RecyclerViewDemoActivity.this, "hello", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        Toast.makeText(RecyclerViewDemoActivity.this, "hii", Toast.LENGTH_SHORT).show();
                    }
                })
        );


    }
}