package com.jiyun.shuaijie.mvpdemo.presenter;

import com.jiyun.shuaijie.mvpdemo.apis.CallBack_Interface;

/**
 * Created by shuaiJie on 2017/9/13.
 */

public interface Login_Presenter_Interface<T> {
    void login(String account, String password);
}
