package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class OnlineImageActiivtyDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_image_actiivty_demo);
        ImageView myimg = findViewById(R.id.myimg);
        String url = "https://www.mashed.com/img/gallery/believe-it-or-not-oranges-dont-actually-exist-naturally-in-nature/l-intro-1676042900.jpg";
        Picasso.get().load(url).into(myimg);
    }
}