package com.example.light.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileOutputStream;
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
                    JSONObject json = new JSONObject();
                    try{
                        json.put("username",username.getText().toString());
                        json.put("password",password.getText().toString());
                    }catch(JSONException e){
                        e.printStackTrace();
                    }

                    try {
                        String result = okhttpConnection.post("/login",json.toString());
                        Log.i("Baobaoyue",result);
                        try{
                            JSONObject out = new JSONObject(result);
                            String token = out.getString("token");
                            String status = out.getString("status");
                            if ( status.equals("true")){
                                try{
                                    String userInfo = okhttpConnection.post("/login",json.toString(),token);
                                    Log.i("Baobaoyue2",userInfo);
                                    writeFiles(userInfo);
                                }catch(IOException e){
                                    e.printStackTrace();
                                }
                                Intent intent = new Intent(Loginactivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        }catch(JSONException e){
                            e.printStackTrace();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };
        });
    }

    private void writeFiles(String string){
        try{
            FileOutputStream outputStream = openFileOutput("UserInfo", Context.MODE_PRIVATE);
            outputStream.write(string.getBytes());
            outputStream.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
