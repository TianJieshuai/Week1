package com.jiyun.shuaijie.mvpdemo.model;

import com.jiyun.shuaijie.mvpdemo.apis.CallBack_Interface;

/**
 * Created by shuaiJie on 2017/9/13.
 */

public interface Login_Model_Interface<T> {
    void login(String account, String password, CallBack_Interface<T> callBack);
}
