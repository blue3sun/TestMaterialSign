package com.lanjing.monkey;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends Activity {

    private ListView mListVew;
    private ArrayList<String> mDatas;
    private SecondAdapter mSecondAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initData();
        initView();
    }

    private void initData() {
        mDatas = new ArrayList<String>();
        for(int i=0;i<10;i++){
            mDatas.add("测试数据000"+i);
        }
    }


    private void initView() {
        mListVew = (ListView) findViewById(R.id.lv);
        mSecondAdapter = new SecondAdapter(mDatas,this);
        mListVew.setAdapter(mSecondAdapter);
    }
}
