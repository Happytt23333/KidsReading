package com.example.light.myapplication;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

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
    private String baseurl;
    private String result;

    public void setResult(String re){
        this.result = re;
    }
    public String getResult(){
        return this.result;
    }
    public OkhttpConnection(String baseurl){
        this.baseurl = baseurl;
    }

    public JSONObject postData(final String url,JSONObject postjson){
        try{
            OkHttpClient client = new OkHttpClient();
            RequestBody requestBody= new FormBody.Builder().build();
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
}
