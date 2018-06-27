package com.manuelmoure.drinkshop.ui.root;

import android.app.Application;

import com.manuelmoure.drinkshop.ui.root.di.ApplicationComponent;
import com.manuelmoure.drinkshop.ui.root.di.ApplicationModule;
import com.manuelmoure.drinkshop.ui.root.di.DaggerApplicationComponent;

/**
 * Created by ManuelMoure on 26/06/2018.
 */

public class App extends Application {

    private ApplicationComponent appComponent;
    private static App instance;

    public static App getInstance() {
        return instance;
    }

    public static void setInstance(App instance) {
        App.instance = instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setInstance(this);

        appComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getAppComponent() {
        return appComponent;
    }
}
