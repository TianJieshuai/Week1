package com.jiyun.shuaijie.week1.service;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;

import com.jiyun.shuaijie.week1.BuildConfig;
import com.jiyun.shuaijie.week1.MainActivity;

/**
 * Created by shuaiJie on 2017/9/11.
 */

public class SubService extends Service {
    public static final String TAG = "SubService:";
    private SubService instance;

    public SubService() {
        super();
        if (BuildConfig.DEBUG) Log.d(TAG, "创建了新的");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        if (BuildConfig.DEBUG) Log.d(TAG, "onCreate");
    }


    public class MyBinder extends Binder {
        public SubService getService() {
            if (BuildConfig.DEBUG) Log.d(TAG, "getService");
            return instance;
        }
    }

    private MyBinder binder = new MyBinder();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        if (BuildConfig.DEBUG) Log.d(TAG, "onBind");
        return binder;
    }

    public void logString(String s) {
        if (BuildConfig.DEBUG) Log.d(TAG, s);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (BuildConfig.DEBUG) Log.d(TAG, "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public boolean onUnbind(Intent intent) {
        if (BuildConfig.DEBUG) Log.d(TAG, "onUnbind");
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (BuildConfig.DEBUG) Log.d(TAG, "onDestroy");
    }
}
