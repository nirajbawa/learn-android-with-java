package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mycalculator.databinding.ActivitySharePreferencesBinding;

public class SharePreferencesActivity extends AppCompatActivity {
    ActivitySharePreferencesBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySharePreferencesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.setTextBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                binding.nameBox.setText(binding.nameInput.getText().toString());
            }
        });

        binding.saveBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                saveState();
            }
        });
        againLoadState();
    }
    public void saveState()
    {
        String text = binding.nameInput.getText().toString();
        SharedPreferences preferences = getSharedPreferences("sharedPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("text", text);
        editor.putBoolean("switch", binding.switchBtn.isChecked());
        editor.apply();
        Toast.makeText(this, "Data is saved", Toast.LENGTH_LONG).show();
    }

    public void againLoadState()
    {
        SharedPreferences preferences = getSharedPreferences("sharedPrefs", MODE_PRIVATE);
        binding.nameBox.setText(preferences.getString("text", ""));
        binding.switchBtn.setChecked(preferences.getBoolean("switch", false));
    }
}