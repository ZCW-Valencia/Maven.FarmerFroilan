package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Produce;

public class Horse extends Animal implements Rideable {
//    Instance Variables
    private boolean isMounted;
    private boolean isBeingRidden;
    private boolean isDismounted;



//    Constructor
    public Horse() {}



//    Methods

    @Override
    public String makeNoise() {
        return "Neigh!";
    }

    @Override
    public boolean hasEaten() {
        return false;
    }

    public boolean exercise() {
        return false;
    }

    @Override
    public void eat(Produce food, int amount) {
    }
}
