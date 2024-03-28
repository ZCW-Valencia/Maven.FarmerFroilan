package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Vehicle implements NoiseMaker, Rideable {

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public void getIsMounted(boolean isMounted) {

    }

    @Override
    public void getIsBeingRidden(boolean isBeingRidden) {

    }

    @Override
    public void getIsDismounted(boolean isDismounted) {

    }
}
