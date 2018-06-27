package com.manuelmoure.drinkshop.ui.root.di;

import com.manuelmoure.drinkshop.ui.root.App;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ManuelMoure on 26/06/2018.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(App app);
}
