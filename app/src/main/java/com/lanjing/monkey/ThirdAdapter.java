package com.lanjing.monkey;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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

public class ThirdAdapter extends RecyclerView.Adapter<ThirdAdapter.InfoViewHolder> {

    private ArrayList<String> mDatas;
    private Context mContext;

    public ThirdAdapter(ArrayList<String> mDatas, Context mContext) {
        this.mDatas = mDatas;
        this.mContext = mContext;
    }


    @Override
    public InfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_third,null);
        InfoViewHolder infoViewHolder = new InfoViewHolder(view);
        return infoViewHolder;
    }

    @Override
    public void onBindViewHolder(InfoViewHolder holder, int position) {
        String info = mDatas.get(position);
        holder.btnInfo.setText(info);
        holder.btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("ThirdAdapter", "onClick: 点击了button");
            }
        });
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("ThirdAdapter", "onClick: 点击了cardview");
            }
        });
        if(position%2==0){
            holder.ivInfo.setImageResource(R.mipmap.butterfly);
        }else{
            holder.ivInfo.setImageResource(R.mipmap.star);
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
        private CardView cv;


        public InfoViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            btnInfo = (Button)itemView.findViewById(R.id.btn_info);
            ivInfo = (ImageView)itemView.findViewById(R.id.iv_img);
        }
    }
}
