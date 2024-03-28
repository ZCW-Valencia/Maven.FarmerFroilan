package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Produce;

public class Horse extends Animal implements Rideable {
//    Instance Variables
    private boolean isMounted;
    private boolean isBeingRidden;
    private boolean isDismounted;
    Crop corn = new Crop();


//    Constructor
    public Horse() {}

    public Horse(boolean isMounted, boolean isBeingRidden, boolean isDismounted) {
        this.isMounted = isMounted;
        this.isBeingRidden = isBeingRidden;
        this.isDismounted = isDismounted;
    }


//    Getters
    public boolean isMounted() {
        return isMounted;
    }

    public boolean isBeingRidden() {
        return isBeingRidden;
    }

    public boolean isDismounted() {
        return isDismounted;
    }


//    Methods
    @Override
    public String makeNoise() {
        return "Neigh!";
    }

//    @Override
//    public boolean hasEaten() {
//        return false;
//    }

    @Override
    public void eat(Produce food, int amount) {
        if (food == corn && amount == 5) {
            hasEaten = true;
        } else {
            hasEaten = false;
        }
    }

    public boolean exercise() {
        if (isMounted && isBeingRidden && !isDismounted) {
            return true;
        }
        return false;
    }
}
