package com.example.light.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.icu.text.AlphabeticIndex;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RecordingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recording);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null ){
            actionBar.hide();
        }

        String str = "（认读能力）孩子阅读过程中遇到多少生词";
        int fend =  "（认读能力）".length();
        SpannableStringBuilder style =  new SpannableStringBuilder(str);
        style.setSpan(new ForegroundColorSpan(Color.parseColor("#55BBCA")),0,fend, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        TextView text_one = (TextView)findViewById(R.id.text_one);
        text_one.setText(style);

        String str2 = "（理解能力）由家长问孩子，例如你觉得这本书教会了我们什么道理呀？";
        int fend2 =  "（理解能力）由家长问孩子，例如".length();
        SpannableStringBuilder style2 =  new SpannableStringBuilder(str2);
        style2.setSpan(new ForegroundColorSpan(Color.parseColor("#55BBCA")),0,fend2, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        TextView text_two = (TextView)findViewById(R.id.text_two);
        text_two.setText(style2);

        String str3 = "（迁移能力）孩子能从读物中联想到生活中多少个场景？";
        int fend3 =  "（迁移能力）".length();
        SpannableStringBuilder style3 =  new SpannableStringBuilder(str3);
        style3.setSpan(new ForegroundColorSpan(Color.parseColor("#55BBCA")),0,fend3, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        TextView text_three= (TextView)findViewById(R.id.text_three);
        text_three.setText(style3);

        TextView recording_cancel = (TextView)findViewById(R.id.recording_cancel);
        recording_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecordingActivity.this,ReadingActivity.class);
                startActivity(intent);
            }
        });

        TextView recording_finish = (TextView)findViewById(R.id.recording_finish);
        recording_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecordingActivity.this,ReadingActivity.class);
                startActivity(intent);
            }
        });
    }
}
