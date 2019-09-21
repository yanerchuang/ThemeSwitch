package com.ywj.myapplication;

import android.app.Application;
import android.content.Context;

/**
 * @author : YOULU  ywj
 * date   : 2019/9/5 11:01
 * desc   :
 */
public class MyApplication extends Application {
    public static long startTime;
    @Override
    protected void attachBaseContext(Context base) {
        startTime = System.currentTimeMillis();
        super.attachBaseContext(base);
    }
}
