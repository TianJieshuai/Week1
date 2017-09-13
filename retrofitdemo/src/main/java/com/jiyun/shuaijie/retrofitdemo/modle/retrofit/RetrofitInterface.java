package com.jiyun.shuaijie.retrofitdemo.modle.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by shuaiJie on 2017/9/13.
 */

public interface RetrofitInterface {
    //http://v.juhe.cn/weixin/query?key=a332c6b34264527ac142764eaed9364d&pno=1
    @GET("/weixin/query")
    Call<Entity> sendGer(@Query("key") String key, @Query("pno") String pno);
}
