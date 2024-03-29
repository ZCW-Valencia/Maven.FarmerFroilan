package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public abstract class Person <T>implements NoiseMaker, Eater {
    private String name;
    private Boolean hasEaten;


    public Person(String name) {
        this.name = name;
        this.hasEaten = false;
    }

    public String getName() {
        return name;
    }

    public void setHasEaten(Boolean hasEaten) {
        this.hasEaten = hasEaten;
    }
}
