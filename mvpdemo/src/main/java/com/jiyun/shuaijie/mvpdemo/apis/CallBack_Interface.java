package com.jiyun.shuaijie.mvpdemo.apis;

/**
 * Created by shuaiJie on 2017/9/13.
 */

public interface CallBack_Interface<T> {
    void succeed(T entity);

    void defeated(Exception e);

    void notRule(int rulecode);
}
