package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Food.Plate;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Produce;

public abstract class Animal implements Eater, NoiseMaker {
    private boolean hasEaten;

    @Override
    public void eat(Plate plate, int amount){

    }

    public void setHasEaten(boolean hasEaten) {
        this.hasEaten = hasEaten;
    }
}
