package com.example.mycalculator.adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mycalculator.R;
import com.example.mycalculator.model.RecipeModel;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.viewHolder>{

    ArrayList<RecipeModel> list;
    Context context;
    public  RecipeAdapter(ArrayList<RecipeModel> list, Context context)
    {
        this.list = list;
        this.context = context;
    }
    @NonNull
    @Override
    public RecipeAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_recycler_view_card, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeAdapter.viewHolder holder, int position) {
        RecipeModel model = list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());

//        holder.imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context, "hello", Toast.LENGTH_LONG).show();
//            }
//        });

//        switch (position){
//            case 0:
//                holder.imageView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Toast.makeText(context, "hello 1", Toast.LENGTH_LONG).show();
//                    }
//                });
//                break;
//            case 1:
//                holder.imageView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Toast.makeText(context, "hello 2", Toast.LENGTH_LONG).show();
//                    }
//                });
//                break;
//            case 2:
//                holder.imageView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Toast.makeText(context, "hello 3", Toast.LENGTH_LONG).show();
//                    }
//                });
//                break;
//        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class viewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public viewHolder(@NonNull View itemView)
        {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);

        }
    }
}
