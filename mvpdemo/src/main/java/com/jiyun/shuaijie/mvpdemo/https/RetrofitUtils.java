package com.jiyun.shuaijie.mvpdemo.https;

import com.google.gson.Gson;
import com.jiyun.shuaijie.mvpdemo.apis.RetrofitCall;
import com.jiyun.shuaijie.mvpdemo.entity.Entity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by shuaiJie on 2017/9/13.
 */

public class RetrofitUtils {
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

    public void sendGet(String account, String password, Callback<Entity> callback) {
        RetrofitCall retrofitCall = retrofit.create(RetrofitCall.class);
        Call<Entity> entityCall = retrofitCall.sendGer(account, password);
        entityCall.enqueue(callback);
    }
}
