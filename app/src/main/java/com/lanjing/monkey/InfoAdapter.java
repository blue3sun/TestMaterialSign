package com.lanjing.monkey;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Description:
 * Author: lanjing
 * Time: 2017/3/21 17:12
 */

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.InfoViewHolder> {

    private ArrayList<String> mDatas;
    private Context mContext;

    public InfoAdapter(ArrayList<String> mDatas, Context mContext) {
        this.mDatas = mDatas;
        this.mContext = mContext;
    }


    @Override
    public InfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_info,null);
        InfoViewHolder infoViewHolder = new InfoViewHolder(view);
        return infoViewHolder;
    }

    @Override
    public void onBindViewHolder(InfoViewHolder holder, int position) {
        String info = mDatas.get(position);
        holder.btnInfo.setText(info);
        if(position%2==0){
            holder.ivInfo.setImageResource(android.support.v7.appcompat.R.drawable.abc_ic_menu_share_mtrl_alpha);
        }else{
            holder.ivInfo.setImageResource(android.support.v7.appcompat.R.drawable.abc_ic_star_black_36dp);
        }
    }

    @Override
    public int getItemCount() {
        if(mDatas!=null){
            return mDatas.size();
        }else{
            return 0;
        }
    }

    public class InfoViewHolder extends RecyclerView.ViewHolder{
        private Button btnInfo;
        private ImageView ivInfo;


        public InfoViewHolder(View itemView) {
            super(itemView);
            btnInfo = (Button)itemView.findViewById(R.id.btn_info);
            ivInfo = (ImageView)itemView.findViewById(R.id.iv_img);
        }
    }
}
