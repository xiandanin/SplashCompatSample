package com.dyhdyh.splashcompat.sample;

import android.app.Application;

/**
 * @author dengyuhan
 * created 2019/1/28 10:21
 */
public class SampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        try {
            //延迟1秒进入Activity 以方便看出效果
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
