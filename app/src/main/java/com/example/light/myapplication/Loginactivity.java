package com.example.light.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.IOException;


public class Loginactivity extends AppCompatActivity {
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null ){
            actionBar.hide();
        }
        username = (EditText)findViewById(R.id.login_username);
        password = (EditText)findViewById(R.id.login_pwd);


        TextView login=(TextView) findViewById(R.id.wancheng);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(downloadRun).start();
            }
            /**
             * 下载线程
             */
            Runnable downloadRun = new Runnable(){
                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    OkhttpConnection okhttpConnection = new OkhttpConnection();
                    try {
                        String json = okhttpConnection.get("/hello");
                        Log.i("Baobaoyue",json);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };
        });
    }
}
