package com.example.light.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.icu.text.AlphabeticIndex;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import okhttp3.OkHttpClient;

public class RecordingActivity extends AppCompatActivity {
    public String bookname;
    public Questionnaire questionnaire;
    public String result;
    public Handler handler = new Handler();

    public void setQuestionnaire(Questionnaire questionnaire){
        Log.d("quuuuuuuuuuuuuuu", "setQuestionnaire: ");
        this.questionnaire = questionnaire;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recording);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        bookname = bundle.getString("bookname");

        Log.i("questionnaire", "yuxiao1");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    OkhttpConnection okhttpConnection = new OkhttpConnection();
                    result = okhttpConnection.get("/questionnaire");
                    Log.i("questionnaire", "result");
                    Log.i("questionnaire", result);
                    Log.i("questionnaire", "yuxiao2");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Log.i("questionnaire", "yuxiao3");
                Questionnaire question = getQuestionnaire(bookname, result);
                setQuestionnaire(question);
                Log.i("questionnaire", "dsfj");
                Log.i("questionnaire", question.title.bookname);
                Log.i("para1",questionnaire.title.title1);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        TextView bookname = (TextView) findViewById(R.id.record_bookname);
                        bookname.setText(questionnaire.title.bookname);
                        TextView question_title1 = (TextView) findViewById(R.id.question_title1);
                        question_title1.setText(questionnaire.title.title1);
                        RadioButton title1_answerA = (RadioButton) findViewById(R.id.title1_answerA);
                        title1_answerA.setText("A." + questionnaire.answer.get(0).answerA);
                        RadioButton title1_answerB = (RadioButton) findViewById(R.id.title1_answerB);
                        title1_answerB.setText("B." + questionnaire.answer.get(0).answerB);
                        RadioButton title1_answerC = (RadioButton) findViewById(R.id.title1_answerC);
                        title1_answerC.setText("C." + questionnaire.answer.get(0).answerC);

                        TextView question_title2 = (TextView) findViewById(R.id.question_title2);
                        question_title2.setText(questionnaire.title.title2);
                        RadioButton title2_answerA = (RadioButton) findViewById(R.id.title2_answerA);
                        title2_answerA.setText("A." + questionnaire.answer.get(1).answerA);
                        RadioButton title2_answerB = (RadioButton) findViewById(R.id.title2_answerB);
                        title2_answerB.setText("B." + questionnaire.answer.get(1).answerB);
                        RadioButton title2_answerC = (RadioButton) findViewById(R.id.title2_answerC);
                        title2_answerC.setText("C." + questionnaire.answer.get(1).answerC);

                        TextView question_title3 = (TextView) findViewById(R.id.question_title3);
                        question_title3.setText(questionnaire.title.title3);
                        RadioButton title3_answerA = (RadioButton) findViewById(R.id.title3_answerA);
                        title3_answerA.setText("A." + questionnaire.answer.get(2).answerA);
                        RadioButton title3_answerB = (RadioButton) findViewById(R.id.title3_answerB);
                        title3_answerB.setText("B." + questionnaire.answer.get(2).answerB);
                        RadioButton title3_answerC = (RadioButton) findViewById(R.id.title3_answerC);
                        title3_answerC.setText("C." + questionnaire.answer.get(2).answerC);

                        TextView question_title4 = (TextView) findViewById(R.id.question_title4);
                        question_title4.setText(questionnaire.title.title4);
                        RadioButton title4_answerA = (RadioButton) findViewById(R.id.title4_answerA);
                        title4_answerA.setText("A." + questionnaire.answer.get(3).answerA);
                        RadioButton title4_answerB = (RadioButton) findViewById(R.id.title4_answerB);
                        title4_answerB.setText("B." + questionnaire.answer.get(3).answerB);
                        RadioButton title4_answerC = (RadioButton) findViewById(R.id.title4_answerC);
                        title4_answerC.setText("C." + questionnaire.answer.get(3).answerC);

                        TextView question_title5 = (TextView) findViewById(R.id.question_title5);
                        question_title5.setText(questionnaire.title.title5);
                        RadioButton title5_answerA = (RadioButton) findViewById(R.id.title5_answerA);
                        title5_answerA.setText("A." + questionnaire.answer.get(4).answerA);
                        RadioButton title5_answerB = (RadioButton) findViewById(R.id.title5_answerB);
                        title5_answerB.setText("B." + questionnaire.answer.get(4).answerB);
                        RadioButton title5_answerC = (RadioButton) findViewById(R.id.title5_answerC);
                        title5_answerC.setText("C." + questionnaire.answer.get(4).answerC);
                    }
                });

            }
        }).start();
        Log.i("questionnaire", "yuxiao2");
        TextView recording_finish = (TextView) findViewById(R.id.recording_finish);
        recording_finish.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        JSONObject json = new JSONObject();
                        RadioButton title1_answerA = (RadioButton) findViewById(R.id.title1_answerA);
                        if(title1_answerA.isChecked()){
                            json.put("1","A");
                        }
                        RadioButton title1_answerB = (RadioButton) findViewById(R.id.title1_answerB);
                        if(title1_answerB.isChecked()){
                            json.put("1","B");
                        }
                        RadioButton title1_answerC = (RadioButton) findViewById(R.id.title1_answerC);
                        if(title1_answerC.isChecked()){
                            json.put("1","B");
                        }
                        RadioButton title2_answerA = (RadioButton) findViewById(R.id.title2_answerA);
                        if(title2_answerA.isChecked()){
                            json.put("2","A");
                        }
                        RadioButton title2_answerB = (RadioButton) findViewById(R.id.title2_answerB);
                        if(title2_answerB.isChecked()){
                            json.put("2","B");
                        }
                        RadioButton title2_answerC = (RadioButton) findViewById(R.id.title2_answerC);
                        if(title2_answerC.isChecked()){
                            json.put("2","C");
                        }

                        RadioButton title3_answerA = (RadioButton) findViewById(R.id.title3_answerA);
                        if(title3_answerA.isChecked()){
                            json.put("3","A");
                        }
                        RadioButton title3_answerB = (RadioButton) findViewById(R.id.title3_answerB);
                        if(title3_answerB.isChecked()){
                            json.put("3","B");
                        }
                        RadioButton title3_answerC = (RadioButton) findViewById(R.id.title3_answerC);
                        if(title3_answerC.isChecked()){
                            json.put("3","C");
                        }

                        RadioButton title4_answerA = (RadioButton) findViewById(R.id.title4_answerA);
                        if(title4_answerA.isChecked()){
                            json.put("4","A");
                        }
                        RadioButton title4_answerB = (RadioButton) findViewById(R.id.title4_answerB);
                        if(title4_answerB.isChecked()){
                            json.put("4","B");
                        }
                        RadioButton title4_answerC = (RadioButton) findViewById(R.id.title4_answerC);
                        if(title4_answerC.isChecked()){
                            json.put("4","C");
                        }

                        RadioButton title5_answerA = (RadioButton) findViewById(R.id.title5_answerA);
                        if(title5_answerA.isChecked()){
                            json.put("5","A");
                        }
                        RadioButton title5_answerB = (RadioButton) findViewById(R.id.title5_answerB);
                        if(title5_answerB.isChecked()){
                            json.put("5","B");
                        }
                        RadioButton title5_answerC = (RadioButton) findViewById(R.id.title5_answerC);
                        if(title5_answerC.isChecked()){
                            json.put("5","C");
                        }
                        JSONObject json2 =new JSONObject();
                        json2.put("bookname",bookname);
                        json2.put("answer",json);
                        Log.i("answer",json2.toString());
                    }catch(Exception e){
                        e.printStackTrace();
                        Log.w("ExceptionWT","click");
                    }

                }
            }).start();
            Intent intent = new Intent(RecordingActivity.this, ShufangActivity.class);
            startActivity(intent);
        }
    });
}

    private Questionnaire getQuestionnaire(String bookname,String result){
        Questionnaire questionnaire = new Questionnaire();
        try{
            JSONObject jsonObject = new JSONObject(result);
            Iterator iterator = jsonObject.keys();
            while (iterator.hasNext()){
                String keys = (String)iterator.next();
                String titleName = jsonObject.getJSONObject(keys).getJSONObject("title").getString("bookname");
                Log.i("yuxiao",titleName);
                if(titleName.equals(bookname)){
                    Log.i("wt1","success");
                    JSONObject obj1 = jsonObject.getJSONObject(keys).getJSONObject("title");
                    Title title = new Title();
                    title.setBookname(obj1.getString("bookname"));
                    title.setTitle1(obj1.getString("title1"));
                    title.setTitle2(obj1.getString("title2"));
                    title.setTitle3(obj1.getString("title3"));
                    title.setTitle4(obj1.getString("title4"));
                    title.setTitle5(obj1.getString("title5"));
                    questionnaire.title = title;

                    JSONObject obj2 = jsonObject.getJSONObject(keys).getJSONObject("option");
                    List<Answer> answerList = new ArrayList<>();
                    for(int i = 1 ; i<6;i++){
                        Answer answer = new Answer();
                        String newstr = "title"+ String.valueOf(i);
                        Log.i("wt2" ,newstr);
                        answer.answerA = obj2.getJSONObject(newstr).getString("A");
                        answer.answerB = obj2.getJSONObject(newstr).getString("B");
                        answer.answerC = obj2.getJSONObject(newstr).getString("C");
                        answerList.add(answer);
                    }
                    questionnaire.setAnswer(answerList);
                    break;
                }
            }
        }catch(JSONException e){
            e.printStackTrace();
        }
        Log.i("quuuuuuuuuuuuuuuu", questionnaire.title.bookname);
        return questionnaire;
    }
}
