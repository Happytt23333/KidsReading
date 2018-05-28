package com.example.light.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class GexingActivity extends AppCompatActivity {
    int flag = 0;
    String username;
    StringBuilder content1 = new StringBuilder();
    StringBuilder content2 = new StringBuilder();
    StringBuilder content3 = new StringBuilder();
    JSONObject userRead;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gexing);

        try{
            userRead = new JSONObject(read());
            username = userRead.getString("username");
            content1.append(username);
            content1.append("目前的认知能力（识字量）：");
            content1.append(userRead.getString("ablity"));
            content2.append(username);
            content2.append("目前的理解能力（内容理解）：");
            content2.append(userRead.getString("ablity"));
            content3.append(username);
            content3.append("目前的迁移能力（生活运用）：");
            content3.append(userRead.getString("ablity"));
        }catch(JSONException e){
            e.printStackTrace();
        }

        TextView abilityOne = (TextView)findViewById(R.id.ability_one);
        abilityOne.setText(content1);
        TextView abilityTwo = (TextView)findViewById(R.id.ability_two);
        abilityTwo.setText(content2);
        TextView abilityThree = (TextView)findViewById(R.id.ability_three);
        abilityThree.setText(content2);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null ){
            actionBar.hide();
        }

        final Button xg1=(Button)findViewById(R.id.xiguan2_first);
        xg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(xg1);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(xg1);
                        flag = 0;
                        break;
                }
            }
        });

        final Button xg2=(Button)findViewById(R.id.xiguan2_second);
        xg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(xg2);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(xg2);
                        flag = 0;
                        break;
                }
            }
        });

        final Button xg3=(Button)findViewById(R.id.xiguan2_third);
        xg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(xg3);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(xg3);
                        flag = 0;
                        break;
                }
            }
        });

        final Button xg4=(Button)findViewById(R.id.xiguan2_forth);
        xg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(xg4);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(xg4);
                        flag = 0;
                        break;
                }
            }
        });

        final Button xg5=(Button)findViewById(R.id.xiguan2_fivth);
        xg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(xg5);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(xg5);
                        flag = 0;
                        break;
                }
            }
        });

        final Button xg6=(Button)findViewById(R.id.xiguan2_sixth);
        xg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(xg6);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(xg6);
                        flag = 0;
                        break;
                }
            }
        });

        final Button jw1=(Button)findViewById(R.id.jiaowang2_first);
        jw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(jw1);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(jw1);
                        flag = 0;
                        break;
                }
            }
        });

        final Button jw2=(Button)findViewById(R.id.jiaowang2_second);
        jw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(jw2);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(jw2);
                        flag = 0;
                        break;
                }
            }
        });

        final Button jw3=(Button)findViewById(R.id.jiaowang2_third);
        jw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(jw3);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(jw3);
                        flag = 0;
                        break;
                }
            }
        });

        final Button jw4=(Button)findViewById(R.id.jiaowang2_forth);
        jw4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(jw4);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(jw4);
                        flag = 0;
                        break;
                }
            }
        });

        final Button pg1=(Button)findViewById(R.id.pinge2_first);
        pg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(pg1);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(pg1);
                        flag = 0;
                        break;
                }
            }
        });

        final Button pg2=(Button)findViewById(R.id.pinge2_second);
        pg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(pg2);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(pg2);
                        flag = 0;
                        break;
                }
            }
        });

        final Button pg3=(Button)findViewById(R.id.pinge2_third);
        pg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(pg3);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(pg3);
                        flag = 0;
                        break;
                }
            }
        });

        final Button pg4=(Button)findViewById(R.id.pinge2_forth);
        pg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(pg4);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(pg4);
                        flag = 0;
                        break;
                }
            }
        });

        final Button pg5=(Button)findViewById(R.id.pinge2_fivth);
        pg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(pg5);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(pg5);
                        flag = 0;
                        break;
                }
            }
        });

        final Button xgg1=(Button)findViewById(R.id.xingge2_first);
        xgg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(xgg1);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(xgg1);
                        flag = 0;
                        break;
                }
            }
        });

        final Button xgg2=(Button)findViewById(R.id.xingge2_second);
        xgg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(xgg2);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(xgg2);
                        flag = 0;
                        break;
                }
            }
        });

        final Button xgg3=(Button)findViewById(R.id.xingge2_third);
        xgg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(xgg3);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(xgg3);
                        flag = 0;
                        break;
                }
            }
        });

        final Button xgg4=(Button)findViewById(R.id.xingge2_forth);
        xgg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(xgg4);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(xgg4);
                        flag = 0;
                        break;
                }
            }
        });

        final Button kp1=(Button)findViewById(R.id.kepu2_first);
        kp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(kp1);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(kp1);
                        flag = 0;
                        break;
                }
            }
        });

        final Button kp2=(Button)findViewById(R.id.kepu2_second);
        kp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(kp2);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(kp2);
                        flag = 0;
                        break;
                }
            }
        });

        final Button kp3=(Button)findViewById(R.id.kepu2_third);
        kp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(kp3);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(kp3);
                        flag = 0;
                        break;
                }
            }
        });

        final Button rw1=(Button)findViewById(R.id.renwen2_first);
        rw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(rw1);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(rw1);
                        flag = 0;
                        break;
                }
            }
        });

        final Button rw2=(Button)findViewById(R.id.renwen2_second);
        rw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(rw2);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(rw2);
                        flag = 0;
                        break;
                }
            }
        });

        final Button rw3=(Button)findViewById(R.id.renwen2_third);
        rw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(rw3);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(rw3);
                        flag = 0;
                        break;
                }
            }
        });

        final Button rw4=(Button)findViewById(R.id.renwen2_forth);
        rw4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (flag){
                    case 0:
                        changecolor(rw4);
                        flag = 1;
                        break;
                    case 1:
                        huifuColor(rw4);
                        flag = 0;
                        break;
                }
            }
        });

        Button gexing_back = (Button)findViewById(R.id.gexing_back);
        gexing_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GexingActivity.this,ReadingActivity.class);
                startActivity(intent);
            }
        });

        Button gexing_finish = (Button)findViewById(R.id.gexing_tuijian);
        gexing_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(GexingActivity.this,GexingActivity_two.class);
                startActivity(intent2);
            }
        });
    }

    public void changecolor(Button button){
        button.setBackgroundResource(R.drawable.blue);
        int color=getResources().getColor(R.color.white);
        button.setTextColor(color);
    }

    public  void huifuColor(Button button){
        button.setBackgroundResource(R.drawable.gray);
        int color = getResources().getColor(R.color.black);
        button.setTextColor(color);
    }

    private String read(){
        FileInputStream in = null;
        BufferedReader reader = null;
        StringBuilder content = new StringBuilder();
        try{
            in = openFileInput("userInfo");
            reader = new BufferedReader(new InputStreamReader(in));
            String line = "";
            while((line = reader.readLine())!=null){
                content.append(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(reader != null){
                try{
                    reader.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
        return content.toString();
    }
}
