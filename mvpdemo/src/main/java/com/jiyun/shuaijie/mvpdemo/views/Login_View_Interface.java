package com.jiyun.shuaijie.mvpdemo.views;

/**
 * Created by shuaiJie on 2017/9/13.
 */

public interface Login_View_Interface<T> {
    int ACCOUNT_NOT_RULE = 100;
    int PASSWORD_NOT_RULE = 200;

    void succeed(T entity);

    void defeated(Exception e);

    void notRule(int rulecode);
}
