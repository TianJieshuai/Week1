package com.jiyun.shuaijie.retrofitdemo.modle.retrofit;

import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by shuaiJie on 2017/9/13.
 */

public class RetrofitUtils {
    //http://v.juhe.cn/weixin/query?key=a332c6b34264527ac142764eaed9364d&pno=1
    private static RetrofitUtils utils;
    private Retrofit retrofit;

    private RetrofitUtils() {
        retrofit = new Retrofit.Builder().baseUrl("http://v.juhe.cn").addConverterFactory(GsonConverterFactory.create(new Gson())).build();
    }

    public static RetrofitUtils getInstance() {
        if (utils == null) synchronized (RetrofitUtils.class) {
            utils = new RetrofitUtils();
        }
        return utils;
    }

    public void sendGet(String pno, Callback<Entity> callback) {
        RetrofitInterface retrofitInterface = retrofit.create(RetrofitInterface.class);
        Call<Entity> call = retrofitInterface.sendGer("a332c6b34264527ac142764eaed9364d", pno);
        call.enqueue(callback);
    }
}
