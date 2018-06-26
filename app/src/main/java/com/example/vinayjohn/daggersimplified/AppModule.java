package com.example.vinayjohn.daggersimplified;

import dagger.Module;
import dagger.Provides;

/**
 * Created by vinayjohn on 19/06/18.
 */

@Module
public class AppModule {

    App mApplication;

    public AppModule(App application) {
        mApplication = application;
    }

    @Provides
    Animal provideAnimal() {
        return new Animal();
    }

    @Provides
    Dog providesDog(Animal animal) {
        return new Dog(animal);
    }

}
