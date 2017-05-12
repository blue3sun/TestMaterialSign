package com.lanjing.monkey;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ThirdActivity extends Activity {

    private RecyclerView mRecyclerView;
    private ArrayList<String> mDatas;
    private ThirdAdapter mThirdAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        initData();
        initView();
    }

    private void initData() {
        mDatas = new ArrayList<String>();
        for(int i=0;i<4;i++){
            mDatas.add("测试数据000"+i);
        }
    }


    private void initView() {
        mRecyclerView = (RecyclerView)findViewById(R.id.rcv);
        mThirdAdapter = new ThirdAdapter(mDatas,this);
        mRecyclerView.setAdapter(mThirdAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(OrientationHelper.VERTICAL);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);
    }
}
