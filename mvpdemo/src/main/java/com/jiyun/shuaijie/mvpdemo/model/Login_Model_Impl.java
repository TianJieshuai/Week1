package com.jiyun.shuaijie.mvpdemo.model;

import android.os.Handler;
import android.os.Message;

import com.jiyun.shuaijie.mvpdemo.apis.CallBack_Interface;
import com.jiyun.shuaijie.mvpdemo.entity.Entity;
import com.jiyun.shuaijie.mvpdemo.https.RetrofitUtils;
import com.jiyun.shuaijie.mvpdemo.views.Login_View_Interface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by shuaiJie on 2017/9/13.
 */

public class Login_Model_Impl implements Login_Model_Interface<Entity> {
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    callBack.succeed((Entity) msg.obj);
                    break;
                case 2:
                    callBack.defeated((Exception) msg.obj);
                    break;
            }
        }
    };
    private CallBack_Interface<Entity> callBack;

    @Override
    public void login(String account, String password, final CallBack_Interface<Entity> callBack) {
        String rule = "[\\w]{6,16}";
        this.callBack = callBack;
        if (account.matches(rule) && password.matches(rule)) {
            RetrofitUtils.getInstance().sendGet("a332c6b34264527ac142764eaed9364d", "1", new Callback<Entity>() {
                @Override
                public void onResponse(Call<Entity> call, Response<Entity> response) {
                    Message message = new Message();
                    message.what = 1;
                    message.obj = response.body();
                    handler.sendMessage(message);
                }

                @Override
                public void onFailure(Call<Entity> call, Throwable t) {
                    Message message = new Message();
                    message.what = 2;
                    message.obj = t;
                    handler.sendMessage(message);
                }
            });
        } else {
            if (!account.matches(rule)) {
                callBack.notRule(Login_View_Interface.ACCOUNT_NOT_RULE);
            }
            if (!password.matches(rule)) {
                callBack.notRule(Login_View_Interface.PASSWORD_NOT_RULE);
            }
        }
    }
}
