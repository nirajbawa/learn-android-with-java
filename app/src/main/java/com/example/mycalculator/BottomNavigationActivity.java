package com.example.mycalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.example.mycalculator.fragments.FragmentOne;
import com.example.mycalculator.fragments.FragmentSecond;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class BottomNavigationActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        setContentView(R.layout.activity_bottom_navigation);
        transaction.replace(R.id.linearLayout, new FragmentOne());
        transaction.commit();
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                try{
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    int iId = item.getItemId();
                    if(iId==R.id.home)
                    {
                        transaction.replace(R.id.linearLayout, new FragmentOne());
                    } else if (iId==R.id.add) {
                        transaction.replace(R.id.linearLayout, new FragmentSecond());
                    } else if (iId==R.id.profile) {
                        transaction.replace(R.id.linearLayout, new SecondFragment());
                    }
                    transaction.commit();
                }catch (Exception e)
                {
                    Log.d("naverror", e.toString());
                }

                return true;
            }

        });
    }
}