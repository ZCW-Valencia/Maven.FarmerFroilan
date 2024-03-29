package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Produce;

public class Horse extends Animal implements Rideable {
//    Instance Variables
    private boolean isMounted;
    private boolean isBeingRidden;
    private boolean isDismounted;
    private boolean hasEaten;


//    Constructor
    public Horse() {}

    public Horse(boolean isMounted, boolean isBeingRidden, boolean isDismounted) {
        this.isMounted = isMounted;
        this.isBeingRidden = isBeingRidden;
        this.isDismounted = isDismounted;
    }

    public Horse(boolean hasEaten) {
        this.hasEaten = hasEaten;
    }


//    Methods
    public boolean exercise() {
        if (isMounted && isBeingRidden && !isDismounted) {
            return true;
        }
        return false;
    }

    @Override
    public String makeNoise() {
        return "Neigh!";
    }

    @Override
    public void eat(Produce food, int amount) {
        if (food != null && amount > 0) {
            hasEaten = true;
        } else {
            hasEaten = false;
        }
    }

    public boolean getHasEaten() {
        return hasEaten;
    }

    @Override
    public void setHasEaten(boolean hasEaten) {
        this.hasEaten = hasEaten;
    }

    @Override
    public boolean getIsMounted() {
        return isMounted;
    }

    @Override
    public boolean getIsBeingRidden() {
        return isBeingRidden;
    }

    @Override
    public boolean getIsDismounted() {
        return isDismounted;
    }

    @Override
    public void setIsMounted(Object ride) {
        isMounted = true;
        isDismounted = false;
    }

    @Override
    public void setIsBeingRidden(Object ride) {
        isBeingRidden = true;
    }

    @Override
    public void setIsDismounted(Object ride) {
        isMounted = false;
        isDismounted = true;
    }

}
