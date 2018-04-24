package com.example.light.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Message;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

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
    public String baseurl = "https://172.17.0.16";
    public String result;
    public RequestBody requestBody;

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

    public JSONObject postData(final String url){
        try{
            OkHttpClient client = new OkHttpClient();
            RequestBody requestBody=getRequestBody();
            Request request = new Request.Builder().url(baseurl+url).post(requestBody).build();
            Call call = client.newCall(request);
            call.enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    Log.i("okhttp","fail"+e);
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                        setResult(response.body().string());
                    }
                }
            });
        }catch(Exception e){
            e.printStackTrace();
        }

        JSONObject resp=new JSONObject();
        try {
            resp = new JSONObject(getResult());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return resp;
    }

    public JSONObject getData(final String url){
        try{
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder().url(baseurl+url).build();
            Call call = client.newCall(request);
            call.enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    Log.i("okhttp","fail"+e);
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    Log.i("okhttp","sucess");
                    if(response.isSuccessful()){
                        setResult(response.body().string());
                    }
                }
            });
        }catch(Exception e){
            e.printStackTrace();
        }

        JSONObject resp=new JSONObject();
        try {
            resp = new JSONObject(getResult());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return resp;
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
