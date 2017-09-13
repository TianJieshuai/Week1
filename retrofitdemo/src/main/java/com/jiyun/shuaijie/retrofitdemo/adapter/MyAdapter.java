package com.jiyun.shuaijie.retrofitdemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.shuaijie.retrofitdemo.MainActivity;
import com.jiyun.shuaijie.retrofitdemo.R;
import com.jiyun.shuaijie.retrofitdemo.modle.retrofit.Entity;

import java.util.ArrayList;

/**
 * Created by shuaiJie on 2017/9/13.
 */

public class MyAdapter extends BaseAdapter {

    private final ArrayList<Entity.ResultBean.ListBean> listBeans;
    private final MainActivity mainActivity;

    public MyAdapter(ArrayList<Entity.ResultBean.ListBean> listBeans, MainActivity mainActivity) {
        this.listBeans = listBeans;
        this.mainActivity = mainActivity;
    }

    @Override
    public int getCount() {
        return listBeans.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(mainActivity).inflate(R.layout.item, null);
            convertView.setTag(new ViewHolder(convertView));
        }
        ViewHolder holder = (ViewHolder) convertView.getTag();
        Glide.with(mainActivity.getApplicationContext()).load(listBeans.get(position).getFirstImg()).into(holder.item_image);
        holder.item_title.setText(listBeans.get(position).getTitle());
        holder.item_source.setText(listBeans.get(position).getSource());
        return convertView;
    }

    public static class ViewHolder {
        public View rootView;
        public ImageView item_image;
        public TextView item_title;
        public TextView item_source;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.item_image = (ImageView) rootView.findViewById(R.id.item_image);
            this.item_title = (TextView) rootView.findViewById(R.id.item_title);
            this.item_source = (TextView) rootView.findViewById(R.id.item_source);
        }

    }
}
