package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Vehicle implements NoiseMaker, Rideable {

    @Override
    public String makeNoise() {
        return null;
    }
    @Override
    public boolean getIsMounted() {
        return false;

    }

    @Override
    public boolean getIsBeingRidden() {
        return false;
    }

    @Override
    public boolean getIsDismounted() {
        return false;
    }

    @Override
    public void setIsMounted(Object ride) {

    }

    @Override
    public void setIsBeingRidden(Object ride) {

    }

    @Override
    public void setIsDismounted(Object ride) {

    }
}
