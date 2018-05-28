package com.example.light.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Message;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Created by Light on 2018/4/23.
 */

public class OkhttpConnection {
    public String baseurl = "http://122.152.218.100:5000";
    public String result;
    public RequestBody requestBody;
    public final static int CONNECT_TIMEOUT = 60;
    public final static int READ_TIMEOUT = 100;
    public final static int WRITE_TIMEOUT = 60;
    public static final OkHttpClient client = new OkHttpClient.Builder()
            .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)//设置读取超时时间
            .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)//设置写的超时时间
            .connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)//设置连接超时时间
            .build();

    public String getBaseurl(){return this.baseurl;}

    public void setResult(String re){
        this.result = re;
    }
    public String getResult(){
        return this.result;
    }

    public void setRequestBody(RequestBody requestBody){this.requestBody = requestBody;}
    public RequestBody getRequestBody(){return this.requestBody;}

    public OkhttpConnection(String baseurl){
        this.baseurl = baseurl;
    }
    public OkhttpConnection(){}

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(baseurl+url)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        if (response.isSuccessful()) {
            return response.body().string();
        } else {
            throw new IOException("Unexpected code " + response);
        }
    }

    public String post(String url, String json, String header) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(baseurl+url)
                .post(body)
                .addHeader("token",header)
                .build();
        Response response = client.newCall(request).execute();
        if (response.isSuccessful()) {
            return response.body().string();
        } else {
            throw new IOException("Unexpected code " + response);
        }
    }

    public String get(String url) throws IOException {
        Request request = new Request.Builder().url(baseurl+url).get().build();
        Response response = client.newCall(request).execute();
        if (response.isSuccessful()) {
            return response.body().string();
        } else {
            throw new IOException("Unexpected code " + response);
        }
    }

    public String get(String url,String header) throws IOException {
        Request request = new Request.Builder().url(baseurl+url).get().addHeader("token",header).build();
        Response response = client.newCall(request).execute();
        if (response.isSuccessful()) {
            return response.body().string();
        } else {
            throw new IOException("Unexpected code " + response);
        }
    }

    public Message getImage(String url){
        final Message msg = new Message();
        try{
            OkHttpClient okHttpClient = new OkHttpClient();
            final Request request = new Request.Builder()
                    .url(baseurl+url)
                    .build();
            okHttpClient.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    Log.i("okhttp","fail"+e);
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    InputStream inputStream = response.body().byteStream();
                    Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                    msg.obj = bitmap;
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
        return msg;
    }
}
