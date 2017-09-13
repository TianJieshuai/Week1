package com.jiyun.shuaijie.retrofitdemo;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.AbsListView;
import android.widget.ListView;

import com.jiyun.shuaijie.retrofitdemo.adapter.MyAdapter;
import com.jiyun.shuaijie.retrofitdemo.modle.retrofit.Entity;
import com.jiyun.shuaijie.retrofitdemo.modle.retrofit.RetrofitUtils;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ListView mListview;
    private ArrayList<Entity.ResultBean.ListBean> listBeans = new ArrayList<>();
    private MyAdapter myAdapter;
    private SwipeRefreshLayout mSRL;
    private int last;
    private int pno = 1;
    private boolean flash = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        myAdapter = new MyAdapter(listBeans, this);
        mListview.setAdapter(myAdapter);
        sendGet(pno);
        initListener();
        mSRL.setColorSchemeResources(R.color.colorAccent, R.color.colorPrimary, R.color.colorPrimaryDark);
    }

    private void initListener() {
        mSRL.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                if (mSRL.isRefreshing())
                    mSRL.setRefreshing(false);
                pno = 1;
                listBeans.clear();
                sendGet(pno);
            }
        });

        mListview.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                if (BuildConfig.DEBUG) Log.d("MainActivity", "last:" + last);
                if (BuildConfig.DEBUG)
                    Log.d("MainActivity", "myAdapter.getCount():" + myAdapter.getCount());
                if (scrollState == SCROLL_STATE_IDLE && last == myAdapter.getCount() && flash) {
                    flash = false;
                    sendGet(++pno);
                }
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                last = firstVisibleItem + visibleItemCount;
            }
        });
    }

    private void sendGet(int pno) {
        RetrofitUtils.getInstance().sendGet(pno + "", new Callback<Entity>() {
            @Override
            public void onResponse(Call<Entity> call, Response<Entity> response) {
                if (BuildConfig.DEBUG) Log.d("MainActivity", "成功");
                listBeans.addAll(response.body().getResult().getList());
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        myAdapter.notifyDataSetChanged();
                        flash = true;
                    }
                });
            }

            @Override
            public void onFailure(Call<Entity> call, Throwable t) {
                if (BuildConfig.DEBUG) Log.d("MainActivity", t.toString());
            }
        });
    }

    private void initView() {
        mListview = (ListView) findViewById(R.id.mListview);
        mSRL = (SwipeRefreshLayout) findViewById(R.id.mSRL);
    }
}
