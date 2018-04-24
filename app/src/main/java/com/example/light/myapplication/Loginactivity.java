package com.example.light.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import okhttp3.FormBody;
import okhttp3.RequestBody;
import org.json.JSONObject;

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
                RequestBody requestLogin = new FormBody.Builder()
                        .add("username",username.getText().toString())
                        .add("password",password.getText().toString()).
                                build();
                String url = "/user";
                OkhttpConnection okhttpConnection = new OkhttpConnection();
                JSONObject jsonObject = okhttpConnection.getData(url);

                Intent intent = new Intent(Loginactivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
