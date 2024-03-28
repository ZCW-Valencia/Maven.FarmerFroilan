package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public abstract class Person <T>implements NoiseMaker, Eater {
    private String name;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
