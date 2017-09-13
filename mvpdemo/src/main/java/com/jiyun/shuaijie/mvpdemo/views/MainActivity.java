package com.jiyun.shuaijie.mvpdemo.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jiyun.shuaijie.mvpdemo.R;
import com.jiyun.shuaijie.mvpdemo.apis.CallBack_Interface;
import com.jiyun.shuaijie.mvpdemo.entity.Entity;
import com.jiyun.shuaijie.mvpdemo.presenter.Login_Presenter_Impl;
import com.jiyun.shuaijie.mvpdemo.presenter.Login_Presenter_Interface;

public class MainActivity extends AppCompatActivity implements Login_View_Interface<Entity>, View.OnClickListener {

    private EditText mAccount;
    private EditText mPassword;
    private Button mLogin;
    private Login_Presenter_Interface login_presenter_interface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        login_presenter_interface = new Login_Presenter_Impl(this);
    }

    private void initView() {
        mAccount = (EditText) findViewById(R.id.mAccount);
        mPassword = (EditText) findViewById(R.id.mPassword);
        mLogin = (Button) findViewById(R.id.mLogin);

        mLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mLogin:
                login_presenter_interface.login(mAccount.getText().toString(), mPassword.getText().toString());
                break;
        }
    }

    @Override
    public void succeed(Entity entity) {
        Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void defeated(Exception e) {
        Toast.makeText(MainActivity.this, "登录失败", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void notRule(final int rulecode) {
        Toast.makeText(MainActivity.this, "rulecode:" + rulecode, Toast.LENGTH_SHORT).show();
    }

}
