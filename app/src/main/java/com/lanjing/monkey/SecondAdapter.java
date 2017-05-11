package com.lanjing.monkey;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Description:
 * Author: lanjing
 * Time: 2017/3/21 17:12
 */

public class SecondAdapter extends BaseAdapter {

    private ArrayList<String> mDatas;
    private Context mContext;

    public SecondAdapter(ArrayList<String> mDatas, Context mContext) {
        this.mDatas = mDatas;
        this.mContext = mContext;
    }
    @Override
    public int getCount() {
        if(mDatas!=null){
            return mDatas.size();
        }else{
            return 0;
        }
    }

    @Override
    public String getItem(int position) {
        if(mDatas!=null){
            return mDatas.get(position);
        }else{
            return null;
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_second,null);
            viewHolder = new ViewHolder();
            viewHolder.btnInfo = (Button)convertView.findViewById(R.id.btn_info);
            viewHolder.ivInfo = (ImageView)convertView.findViewById(R.id.iv_img);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder)convertView.getTag();
        }
        String info = mDatas.get(position);
        viewHolder.btnInfo.setText(info);
        if(position%2==0){
            viewHolder.ivInfo.setImageResource(R.mipmap.butterfly);
        }else{
            viewHolder.ivInfo.setImageResource(R.mipmap.star);
        }
        return convertView;
    }

    public class ViewHolder{
        private Button btnInfo;
        private ImageView ivInfo;
    }
}
