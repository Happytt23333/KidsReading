package com.example.light.myapplication;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GexingActivity_two extends AppCompatActivity {
    private ImageView tupian;
    private TextView shuming;
    private TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gexing_two);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null ){
            actionBar.hide();
        }

        tupian = (ImageView)findViewById(R.id.tupian);
        shuming = (TextView)findViewById(R.id.shuming);
        content = (TextView)findViewById(R.id.content);

        Button gexing_back2 = (Button)findViewById(R.id.gexing_back2);
        gexing_back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(GexingActivity_two.this,ReadingActivity.class);
                startActivity(intent2);
            }
        });

        Button changeBook = (Button)findViewById(R.id.changeBook);
        changeBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tupian.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.twofriends));
                shuming.setText("两个好朋友");
                content.setText("亚克和露露（一只狗和一只猫）是一对好朋友，他们的兴趣爱好很不一样，他们能做好朋友吗？");
            }
        });
    }
}
