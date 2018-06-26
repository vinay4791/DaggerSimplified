package com.example.vinayjohn.daggersimplified;

/**
 * Created by vinayjohn on 19/06/18.
 */

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
