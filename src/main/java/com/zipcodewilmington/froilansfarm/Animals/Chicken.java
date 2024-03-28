package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Produce;

public class Chicken extends Animal implements Produce {
//    Instance Variables
    private boolean hasBeenFertilized;



//    Constructor
    public Chicken() {}

    public Chicken(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }



//    Methods
    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public String makeNoise() {
        return "Cluck!";
    }

    @Override
    public void eat(Produce food, int amount) {}

    @Override
    public boolean hasEaten() {
    return false;
}

    @Override
    public int yield() {
        return 0;
    }
}
