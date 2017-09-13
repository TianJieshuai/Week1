package com.jiyun.shuaijie.mvpdemo.apis;

import com.jiyun.shuaijie.mvpdemo.entity.Entity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by shuaiJie on 2017/9/13.
 */

public interface RetrofitCall {
    @GET("/weixin/query")
    Call<Entity> sendGer(@Query("key") String account, @Query("pno") String password);
}
