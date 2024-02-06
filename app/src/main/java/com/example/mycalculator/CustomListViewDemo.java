package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.zip.Inflater;

class CustomAdapter extends BaseAdapter{
    Context context;
    String cityList[];
    LayoutInflater inflater;
    public CustomAdapter(Context applicationContext, String[] cityList )
    {
        this.context = applicationContext;
        this.cityList = cityList;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return cityList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.custom_list_view_item, null);
        TextView textView = view.findViewById(R.id.ltext);
        textView.setText(cityList[i]);
        return view;
    }
}

public class CustomListViewDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view_demo);

        String cityNames[] = {"taloda", "nandurbar", "akkalkuwa", "mumbai", "banglore", "heydrabad"};

        ListView listView = findViewById(R.id.CustomListViewDemo);
//
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), cityNames);
        listView.setAdapter(customAdapter);

    }
}