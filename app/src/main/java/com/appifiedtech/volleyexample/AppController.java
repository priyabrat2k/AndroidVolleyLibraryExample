package com.appifiedtech.volleyexample;

import android.app.Application;
import android.content.Context;

/**
 * Created by Priyabrat on 5/11/2015.
 */
public class AppController extends Application {

    private static AppController instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static AppController getInstance() {
        return instance;
    }

    public static Context getAppContext() {
        return instance.getApplicationContext();
    }
}
