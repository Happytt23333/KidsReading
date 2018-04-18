package com.example.light.myapplication;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ReadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null ){
            actionBar.hide();
        }

        ImageView plan = (ImageView)findViewById(R.id.reading_plan);
        plan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReadingActivity.this,Readingplan_two.class);
                startActivity(intent);
            }
        });

        Button adding = (Button)findViewById(R.id.reading_adding);
        adding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReadingActivity.this,AddingActivity.class);
                startActivity(intent);
            }
        });

        ImageView first = (ImageView)findViewById(R.id.reading_first);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReadingActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView watch = (ImageView)findViewById(R.id.reading_watch);
        watch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReadingActivity.this,CommunityActivity.class);
                startActivity(intent);
            }
        });

        ImageView reading_gexing = (ImageView)findViewById(R.id.reading_gexing);
        reading_gexing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReadingActivity.this,GexingActivity.class);
                startActivity(intent);
            }
        });
    }
}
