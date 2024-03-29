package com.zipcodewilmington.froilansfarm.Animals;

//import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Produce;

public abstract class Animal implements Eater, NoiseMaker {
    private boolean hasEaten;

    @Override
    public void eat(Produce food, int amount){

    }

    public void setHasEaten(boolean hasEaten) {
        this.hasEaten = hasEaten;
    }
}
