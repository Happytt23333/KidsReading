package com.example.light.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null ){
            actionBar.hide();
        }

        ImageView image_one= (ImageView)findViewById(R.id.main_photo_two);
        image_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CommentActivity.class);
                startActivity(intent);
            }
        });

        ImageView image_two = (ImageView)findViewById(R.id.main_reading);
        image_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ReadingActivity.class);
                startActivity(intent);
            }
        });

        ImageView image_three = (ImageView)findViewById(R.id.main_watching);
        image_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CommunityActivity.class);
                startActivity(intent);
            }
        });
    }
}
