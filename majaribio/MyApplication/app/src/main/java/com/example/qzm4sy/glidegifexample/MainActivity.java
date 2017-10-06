package com.example.qzm4sy.glidegifexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Glide.with(this).asGif().load("http://cdn.osxdaily.com/wp-content/uploads/2013/07/dancing-banana.gif").into(imageView);
    }
}
