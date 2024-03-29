package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Corn;
import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Produce;

public class Chicken extends Animal implements Produce {
//    Instance Variables
    boolean fertilized;
    boolean hasEaten;

//    Constructor
    public Chicken() {}


//    Methods
    @Override
    public String makeNoise() {
        return "Cluck!";
    }

    @Override
    public void eat(Produce food, int amount) {
        if (food!= null && amount >= 1) {
            hasEaten = true;
        } else {
            hasEaten = false;
        }
    }

    public boolean getHasEaten() {
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

    public void hasBeenFertilized(boolean fertilized) {
        this.fertilized = fertilized;
    }
}
