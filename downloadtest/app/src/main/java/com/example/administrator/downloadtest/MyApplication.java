package com.example.administrator.downloadtest;

import android.app.Application;

import org.xutils.x;

/**
 * Created by Administrator on 2018/11/12.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
