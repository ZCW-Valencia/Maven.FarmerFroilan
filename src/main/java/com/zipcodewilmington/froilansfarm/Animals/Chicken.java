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
    public boolean eat(T food, int amount) {
        if ()
        return
    }
}

    @Override
    public int yield() {
        if (hasBeenFertilized) {}
}
