package com.example.light.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ShufangActivity extends AppCompatActivity implements View.OnClickListener{
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

        TextView shufang_eyu = (TextView)findViewById(R.id.shufang_eyu);
        shufang_eyu.setOnClickListener(this);

        TextView shufang_no = (TextView)findViewById(R.id.shufang_no);
        shufang_no.setOnClickListener(this);

        TextView shufang_can = (TextView)findViewById(R.id.shufang_can);
        shufang_can.setOnClickListener(this);

        TextView shufang_black = (TextView)findViewById(R.id.shufang_black);
        shufang_black.setOnClickListener(this);

        TextView shufang_face = (TextView)findViewById(R.id.shufang_face);
        shufang_face.setOnClickListener(this);

        TextView shufang_grass = (TextView)findViewById(R.id.shufang_grass);
        shufang_grass.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        Intent intent = new Intent(ShufangActivity.this,RecordingActivity.class);
        switch (v.getId()){
            case R.id.shufang_eyu:
                intent.putExtra("bookname","鳄鱼莱莱");
                startActivity(intent);
                break;

            case R.id.shufang_no:
                intent.putExtra("bookname","不,不行");
                startActivity(intent);
                break;

            case R.id.shufang_can:
                intent.putExtra("bookname","凯，能行");
                startActivity(intent);
                break;

            case R.id.shufang_black:
                intent.putExtra("bookname","蜡笔小黑");
                startActivity(intent);
                break;

            case R.id.shufang_face:
                intent.putExtra("bookname","脸  各种各样的脸");
                startActivity(intent);
                break;

            case R.id.shufang_grass:
                intent.putExtra("bookname","草丛里有什么");
                startActivity(intent);
                break;
        }
    }
}
