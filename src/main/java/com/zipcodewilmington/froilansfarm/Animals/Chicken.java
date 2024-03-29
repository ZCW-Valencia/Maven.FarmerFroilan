package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Produce;

public class Chicken extends Animal implements Produce {
//    Instance Variables
    boolean fertilized;


//    Constructor
    public Chicken() {}


//    Methods
    @Override
    public String makeNoise() {
        return "Cluck!";
    }

    @Override
    public void eat(Produce food, int amount) {
        Crop corn = new Crop();
        if (food == corn && amount >= 1) {
            super.setHasEaten(true);
        } else {
            super.setHasEaten(false);
        }
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
