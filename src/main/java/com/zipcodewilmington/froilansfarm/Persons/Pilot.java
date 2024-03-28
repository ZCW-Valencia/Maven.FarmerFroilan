package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;

public class Pilot<T> extends Person implements Rider {
    private Boolean isFlying = false;

    public Pilot(String name) {
        super(name);
    }

    public Boolean getFlying() {
        return isFlying;
    }

    public void fly(T ride) {
        this.isFlying = true;
    }

    @Override
    public void eat(Produce food, int amount) {
    }

    @Override
    public boolean hasEaten() {
        return false;
    }

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
