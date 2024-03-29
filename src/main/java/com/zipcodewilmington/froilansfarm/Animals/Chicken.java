package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Produce;

public class Chicken extends Animal implements Produce {
//    Instance Variables
    private boolean fertilized;
    Crop corn = new Crop();


//    Constructor
    public Chicken() {}


//    Methods
    @Override
    public String makeNoise() {
        return "Cluck!";
    }

    @Override
    public void eat(Produce food, int amount) {
        if (food == corn && amount == 1) {
            hasEaten = true;
        } else {
            hasEaten = false;
        }
    }

    @Override
    public boolean hasEaten() {
    return hasEaten;
}

    @Override
    public int yield() {
        int edibleEgg = 0;
        if (!fertilized) {
            edibleEgg = 1;
        } else {
            return edibleEgg;
        }
        return edibleEgg;
    }

    public boolean hasBeenFertilized() {
        fertilized = true;
        return fertilized;
    }
}
