package com.example.qzm4sy.daggerapp;

import android.app.Application;

import com.example.qzm4sy.daggerapp.components.AppComponent;
import com.example.qzm4sy.daggerapp.components.DaggerAppComponent;
import com.example.qzm4sy.daggerapp.modules.MpenziModule;
import com.example.qzm4sy.daggerapp.views.MainActivity;

/**
 * Created by qzm4sy on 7/17/17.
 */

public class LibuApp extends Application {


    private AppComponent appComponent;


    public static LibuApp get(MainActivity mainActivity){

        return (LibuApp) mainActivity.getApplication();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .mpenziModule(new MpenziModule("RAHMA"))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

}