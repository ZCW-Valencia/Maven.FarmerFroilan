package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;

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
    public void eat(Produce food, int amount) {

    }

    @Override
    public boolean hasEaten() {
        return false;
    }



    public void fly(Boolean isFlying){

    }


    @Override
    public String makeNoise() {
        return "";
    }

    @Override
    public boolean mount(Rideable ride) {
        return true;
    }

    @Override
    public boolean ride(Rideable ride) {
        return true;
    }

    @Override
    public boolean disMount(Rideable ride) {
        return true;
    }
}
