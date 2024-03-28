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

<<<<<<< HEAD


    public void fly(Boolean isFlying){

    }


    @Override
    public String makeNoise() {
        return "";
    }

    @Override
    public boolean mount(Rideable ride) {
        return true;
=======
    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public boolean mount(Rideable ride) {
        return false;
>>>>>>> 4f4ffdba0e6d3a3349b5ea73736397541aa4c225
    }

    @Override
    public boolean ride(Rideable ride) {
<<<<<<< HEAD
        return true;
    }

    @Override
    public boolean disMount(Rideable ride) {
        return true;
=======
        return false;
    }

    @Override
    public boolean dismount(Rideable ride) {
        return false;
>>>>>>> 4f4ffdba0e6d3a3349b5ea73736397541aa4c225
    }
}
