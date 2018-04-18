package com.example.light.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Readingplan_two extends AppCompatActivity{
    int flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readingplan_two);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null ){
            actionBar.hide();
        }

        final Button nl1=(Button)findViewById(R.id.nianlin_first);
        final Button nl2=(Button)findViewById(R.id.nianlin_second);

        nl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nl1.setEnabled(false);
                nl2.setEnabled(true);
                changecolor(nl1);
                huifuColor(nl2);
            }
        });
        nl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nl2.setEnabled(false);
                nl1.setEnabled(true);
                changecolor(nl2);
                huifuColor(nl1);
            }
        });

        final Button xg1=(Button)findViewById(R.id.xiguan_first);
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

        final Button xg2=(Button)findViewById(R.id.xiguan_second);
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

        final Button xg3=(Button)findViewById(R.id.xiguan_third);
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

        final Button xg4=(Button)findViewById(R.id.xiguan_forth);
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

        final Button xg5=(Button)findViewById(R.id.xiguan_fivth);
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

        final Button xg6=(Button)findViewById(R.id.xiguan_sixth);
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

        final Button jw1=(Button)findViewById(R.id.jiaowang_first);
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

        final Button jw2=(Button)findViewById(R.id.jiaowang_second);
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

        final Button jw3=(Button)findViewById(R.id.jiaowang_third);
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

        final Button jw4=(Button)findViewById(R.id.jiaowang_forth);
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

        final Button pg1=(Button)findViewById(R.id.pinge_first);
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

        final Button pg2=(Button)findViewById(R.id.pinge_second);
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

        final Button pg3=(Button)findViewById(R.id.pinge_third);
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

        final Button pg4=(Button)findViewById(R.id.pinge_forth);
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

        final Button pg5=(Button)findViewById(R.id.pinge_fivth);
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

        final Button xgg1=(Button)findViewById(R.id.xingge_first);
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

        final Button xgg2=(Button)findViewById(R.id.xingge_second);
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

        final Button xgg3=(Button)findViewById(R.id.xingge_third);
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

        final Button xgg4=(Button)findViewById(R.id.xingge_forth);
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

        final Button kp1=(Button)findViewById(R.id.kepu_first);
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

        final Button kp2=(Button)findViewById(R.id.kepu_second);
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

        final Button kp3=(Button)findViewById(R.id.kepu_third);
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

        final Button rw1=(Button)findViewById(R.id.renwen_first);
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

        final Button rw2=(Button)findViewById(R.id.renwen_second);
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

        final Button rw3=(Button)findViewById(R.id.renwen_third);
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

        final Button rw4=(Button)findViewById(R.id.renwen_forth);
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

        final Button bakc = (Button)findViewById(R.id.readingplan_back);
        bakc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Readingplan_two.this,ReadingActivity.class);
                startActivity(intent);
            }
        });

        Button watch = (Button)findViewById(R.id.readingplan_watch);
        watch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Readingplan_two.this,readingplanActivity.class);
                startActivity(intent);
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


}