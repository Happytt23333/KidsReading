package com.example.light.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CommunityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null ){
            actionBar.hide();
        }

        ImageView mulu = (ImageView)findViewById(R.id.community_mulu);
        mulu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommunityActivity.this,ShudanActivit.class);
                startActivity(intent);
            }
        });

        ImageView shopping = (ImageView)findViewById(R.id.community_shopping);
        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommunityActivity.this,ShoppingActivity.class);
                startActivity(intent);
            }
        });

        ImageView C_first = (ImageView)findViewById(R.id.C_first);
        C_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommunityActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView C_reading = (ImageView)findViewById(R.id.C_reading);
        C_reading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommunityActivity.this,ReadingActivity.class);
                startActivity(intent);
            }
        });
    }
}
