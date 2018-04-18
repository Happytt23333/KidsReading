package com.example.light.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ShufangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shufang);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null ){
            actionBar.hide();
        }

        Button shufang_back = (Button)findViewById(R.id.Shufang_back);
        shufang_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShufangActivity.this,ReadingActivity.class);
                startActivity(intent);
            }
        });

        ImageView shufang_eyu = (ImageView)findViewById(R.id.Shufang_eyu);
        shufang_eyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShufangActivity.this,RecordingActivity.class);
                startActivity(intent);
            }
        });
    }
}
