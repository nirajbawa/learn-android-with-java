package com.example.mycalculator;


import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;


import com.example.mycalculator.databinding.ActivityContentProvideDemoBinding;

import java.util.ArrayList;

public class ContentProvideDemoActivity extends AppCompatActivity {
    ActivityContentProvideDemoBinding binding;
    ContentValues contentValues;
    Uri uri;
    ContentResolver resolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityContentProvideDemoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        uri = Uri.parse("content://com.nirajbava.androidpractical.DataProvider/users");

        resolver = getContentResolver();

        binding.btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    contentValues = new ContentValues();
                    contentValues.put("name", binding.name.getText().toString());
                    contentValues.put("phone", binding.phone.getText().toString());
                    resolver.insert(uri, contentValues);
                    contentValues.clear();
                    Toast.makeText(ContentProvideDemoActivity.this, "Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Log.d("myerror", e.toString());
                }
            }
        });

        binding.btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    ArrayList list = new ArrayList();

                    Cursor cursor = resolver.query(uri, new String[]{"id", "name", "phone"}, null, null, null);
                    if (cursor.getCount() > 0) {
                        while (cursor.moveToNext()) {
                            String temp = "Id : " + Integer.toString(cursor.getInt(cursor.getColumnIndex("id"))) + "\n" + "Name : " + cursor.getString(cursor.getColumnIndex("name")) + "\nPhone : " + cursor.getString(cursor.getColumnIndex("phone"));
                            list.add(temp);
                        }
                    }

                    cursor.close();

                    ArrayAdapter arrayAdapter = new ArrayAdapter(ContentProvideDemoActivity.this, android.R.layout.simple_list_item_1, list);
                    binding.dataList.setAdapter(arrayAdapter);
                } catch (Exception e) {
                    Log.d("myerror", e.toString());
                }
            }
        });


        binding.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                try {


                    int isDeleted = resolver.delete(uri, "id=" + binding.id.getText().toString(), null);
                    if (isDeleted > 0) {
                        Toast.makeText(ContentProvideDemoActivity.this, "Item Deleted", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(ContentProvideDemoActivity.this, "Invalid Id", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    Log.d("myerror", e.toString());
                }
            }
        });

        binding.btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContentValues values = new ContentValues();
                values.put("name", binding.name.getText().toString());
                values.put("phone", binding.phone.getText().toString());

                int isUpdated = resolver.update(uri, values, "id", null);
                if(isUpdated>0)
                {
                    Toast.makeText(ContentProvideDemoActivity.this, "item updated successfully", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(ContentProvideDemoActivity.this, "invalid item id", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}