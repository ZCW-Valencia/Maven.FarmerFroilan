package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Produce;

public class Chicken extends Animal implements Produce {
//    Instance Variables
    private boolean hasBeenFertilized = false;


//    Constructor
    public Chicken() {}

    public Chicken(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }


//    Methods
    @Override
    public String makeNoise() {
        return "Cluck!";
    }

    @Override
    public void eat(Produce food, int amount) {
        if (food == corn && amount == 1) {
            hasEaten = true;
        }
    }

//    @Override
//    public boolean hasEaten() {
//    return false;
//}

    @Override
    public int yield() {
        return 0;
    }

    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }
}
