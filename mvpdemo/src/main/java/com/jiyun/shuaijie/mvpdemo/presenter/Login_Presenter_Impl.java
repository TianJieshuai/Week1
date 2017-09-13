package com.jiyun.shuaijie.mvpdemo.presenter;

import com.jiyun.shuaijie.mvpdemo.apis.CallBack_Interface;
import com.jiyun.shuaijie.mvpdemo.entity.Entity;
import com.jiyun.shuaijie.mvpdemo.model.Login_Model_Impl;
import com.jiyun.shuaijie.mvpdemo.model.Login_Model_Interface;
import com.jiyun.shuaijie.mvpdemo.views.Login_View_Interface;

/**
 * Created by shuaiJie on 2017/9/13.
 */

public class Login_Presenter_Impl implements Login_Presenter_Interface<Entity> {
    private Login_View_Interface<Entity> login_view_interface;
    private Login_Model_Interface<Entity> login_model_interface;

    public Login_Presenter_Impl(Login_View_Interface<Entity> login_view_interface) {
        this.login_view_interface = login_view_interface;
        login_model_interface = new Login_Model_Impl();
    }

    @Override
    public void login(String account, String password) {
        login_model_interface.login(account, password, new CallBack_Interface<Entity>() {
            @Override
            public void succeed(Entity entity) {
                login_view_interface.succeed(entity);
            }

            @Override
            public void defeated(Exception e) {
                login_view_interface.defeated(e);
            }

            @Override
            public void notRule(int rulecode) {
                login_view_interface.notRule(rulecode);
            }
        });
    }
}
