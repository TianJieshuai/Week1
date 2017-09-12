package com.jiyun.shuaijie.week1;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.jiyun.shuaijie.week1.service.SubService;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mbtn;
    private Button strat_service;
    private Button destroy_service;
    private Button bind_strat_service;
    private Button bind_destroy_service;
    private SubService service1;
    private ServiceConnection conn;
    private SubService subService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //菲大使馆大使夫妇都是 黄金多少级啊开发环节都是空白m
        //三地警方当时警方
        //斯蒂芬斯蒂芬森的
        if (BuildConfig.DEBUG) Log.d("MainActivity", "onCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        if (BuildConfig.DEBUG) Log.d("MainActivity", "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (BuildConfig.DEBUG) Log.d("MainActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (BuildConfig.DEBUG) Log.d("MainActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (BuildConfig.DEBUG) Log.d("MainActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (BuildConfig.DEBUG) Log.d("MainActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (BuildConfig.DEBUG) Log.d("MainActivity", "onDestroy");
        if (conn != null && service1 != null) {
            unbindService(conn);
            conn = null;
            service1 = null;
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (BuildConfig.DEBUG) Log.d("MainActivity", "onSaveInstanceState1");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (BuildConfig.DEBUG) Log.d("MainActivity", "onConfigurationChanged");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        if (BuildConfig.DEBUG) Log.d("MainActivity", "onRestoreInstanceState");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        if (BuildConfig.DEBUG) Log.d("MainActivity", "onSaveInstanceState");
    }

    private void initView() {
        mbtn = (Button) findViewById(R.id.mbtn);

        mbtn.setOnClickListener(this);
        strat_service = (Button) findViewById(R.id.strat_service);
        strat_service.setOnClickListener(this);
        destroy_service = (Button) findViewById(R.id.destroy_service);
        destroy_service.setOnClickListener(this);
        bind_strat_service = (Button) findViewById(R.id.bind_strat_service);
        bind_strat_service.setOnClickListener(this);
        bind_destroy_service = (Button) findViewById(R.id.bind_destroy_service);
        bind_destroy_service.setOnClickListener(this);
        //上的房贷首付
//        onClick(strat_service);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mbtn:
                if (BuildConfig.DEBUG)
                    Log.d("MainActivity", "---------------------------------------------------");
                break;
            case R.id.strat_service:
                startService(new Intent(getApplicationContext(), SubService.class));
                break;
            case R.id.destroy_service:
                stopService(new Intent(getApplicationContext(), SubService.class));
                break;
            case R.id.bind_strat_service:
                conn = new ServiceConnection() {
                    @Override
                    public void onServiceConnected(ComponentName name, IBinder service) {
                        if (service instanceof SubService.MyBinder) {
                            service1 = ((SubService.MyBinder) service).getService();
                            service1.logString("向Service中发送的消息");
                        }
                    }

                    @Override
                    public void onServiceDisconnected(ComponentName name) {
                        if (BuildConfig.DEBUG) Log.d("MainActivity", "解绑了" + name);
                    }
                };
                bindService(new Intent(getApplicationContext(), SubService.class), conn, Service.BIND_ABOVE_CLIENT);
                break;
            case R.id.bind_destroy_service:
                if (conn != null && service1 != null) {
                    unbindService(conn);
                    conn = null;
                    service1 = null;
                }
                break;
        }
    }

    public void setSubService(SubService subService) {
        this.subService = subService;
    }

    public void setBtnText(String s) {
        bind_destroy_service.setText(s);
    }
}
