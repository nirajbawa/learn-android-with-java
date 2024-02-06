package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;

public class AlertDialogDemo extends AppCompatActivity implements View.OnClickListener {

    Button nextBtn, customDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        nextBtn = findViewById(R.id.btnNext);
        nextBtn.setOnClickListener(this);
        customDialog = findViewById(R.id.customDialog);
        customDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==nextBtn.getId()){
            showDialog();
        } else if (view.getId()==customDialog.getId()) {
            showCustomDialog();
        }
    }

    protected void showDialog(){
        new AlertDialog.Builder(AlertDialogDemo.this)
                .setTitle("Exit")
                .setMessage("are you sure you want to exit this app")
                .setIcon(R.drawable.baseline_warning_24)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                }).setNeutralButton("Help", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertDialogDemo.this, "press yes to exit this app", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).show();
    }

    protected void showCustomDialog(){
        Dialog dialog = new Dialog(AlertDialogDemo.this);
        dialog.setContentView(R.layout.activity_custom_alert);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.alert_bg));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        Button no = dialog.findViewById(R.id.btnNo);
        Button yes = dialog.findViewById(R.id.btnYes);

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AlertDialogDemo.this, "you click on no.", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    @Override
    public void onBackPressed() {
        showDialog();
    }
}