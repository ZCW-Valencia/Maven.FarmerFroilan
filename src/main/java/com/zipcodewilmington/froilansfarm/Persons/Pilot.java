package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Produce;

public class Pilot extends Person implements Rider {
    private Boolean isFlying = true;
    CropDuster cropDuster = new CropDuster();


    public Pilot(String name) {
        super(name);
    }

    public Boolean getFlying() {
        return isFlying;
    }

    @Override
    public void eat(Produce food, int amount) {}

    @Override
    public boolean hasEaten() {
        return false;
    }

    public void fly(Boolean isFlying) {}

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public boolean mount(Rideable ride) {
        return false;
    }

    @Override
    public boolean ride(Rideable ride) {
        return false;
    }

    @Override
    public boolean disMount(Rideable ride) {
        return false;
    }
}
