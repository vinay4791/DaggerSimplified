package com.example.vinayjohn.daggersimplified;

import javax.inject.Inject;

/**
 * Created by vinayjohn on 14/03/18.
 */

public class Dog {

    private Animal animal;

    @Inject
    public Dog(Animal animal) {
        this.animal = animal;
    }

    public String getType() {
        return animal.getType();
    }

}
