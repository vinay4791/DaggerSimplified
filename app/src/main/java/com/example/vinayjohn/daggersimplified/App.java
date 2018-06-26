package com.example.vinayjohn.daggersimplified;


import android.app.Application;

/**
 * Created by vinayjohn on 19/06/18.
 */

public class App extends Application {

    private static AppComponent mAppComponent;
    private static App instance = null;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        // Dagger%COMPONENT_NAME%
        mAppComponent = DaggerAppComponent.builder() // list of modules that are part of this component need to be created here too
                .appModule(new AppModule(this))// This also corresponds to the name of your module: %component_name%Module
                .build();
    }

    public static AppComponent getAppComponent() {
        return getInstance().mAppComponent;
    }
}
