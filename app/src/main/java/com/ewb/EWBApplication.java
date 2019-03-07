package com.ewb;

import android.app.Application;

public class EWBApplication extends Application {

    private static EWBApplication ewbApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        ewbApplication = this;
    }

    public static EWBApplication getInstance(){
        return ewbApplication;
    }
}
