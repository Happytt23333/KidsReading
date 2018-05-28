package com.example.light.myapplication;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import okhttp3.OkHttpClient;

public class GexingActivity_two extends AppCompatActivity {
    private ImageView tupian;
    private TextView shuming;
    private TextView content;
    public  List<BookInfo> booklist;

    public void setBooklist(List<BookInfo> booklist){
        this.booklist = booklist;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gexing_two);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null ){
            actionBar.hide();
        }
        Log.i("input","input");
        new Thread(new Runnable() {
            @Override
            public void run() {
                List<BookInfo> bookInfoList = getBook(1f);
                shuming = (TextView)findViewById(R.id.shuming);
                shuming.setText(bookInfoList.get(0).bookname);
            }
        }).start();

        Log.i("output","output");
        tupian = (ImageView)findViewById(R.id.tupian);
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

    private List<BookInfo> getBook(float ablity){
        List<BookInfo> bookInfo = new ArrayList<>();
        float probability;
        float para1;
        float para2;
        float para3;
        try{
            OkhttpConnection okhttpConnection = new OkhttpConnection();
            String result = okhttpConnection.get("/book");
            JSONObject json = new JSONObject(result);
            Log.i("request","request success");
            Iterator iterator = json.keys();
            while(iterator.hasNext()){
                String keys = (String)iterator.next();
                float temp = json.getJSONObject(keys).getInt("difficulty");
                para1 = temp/100;
                para2 = (float) json.getJSONObject(keys).getDouble("complexed");
                para3 = (float) json.getJSONObject(keys).getDouble("complexed2");

                if(para1 >0){
                    Log.i("probability","print probability");
                    probability = para1+para2+para3-ablity;
                    Log.i("value",String.valueOf(probability));
                    if (probability>0.5f){
                        BookInfo book = new BookInfo();
                        Tag tag = new Tag();
                        tag.setTag1(json.getJSONObject(keys).getJSONObject("tag").getString("tag1"));
                        tag.setTag2(json.getJSONObject(keys).getJSONObject("tag").getString("tag2"));
                        tag.setTag3(json.getJSONObject(keys).getJSONObject("tag").getString("tag3"));
                        book.tag = tag;

                        book.bookname = json.getJSONObject(keys).getString("bookname");
                        book.difficulty = para1;
                        book.complexed1 = para2;
                        book.complexed2 = para3;
                        bookInfo.add(book);
                    }
                }else {
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }catch(JSONException e){
            e.printStackTrace();
        }
        return bookInfo;
    }

}
