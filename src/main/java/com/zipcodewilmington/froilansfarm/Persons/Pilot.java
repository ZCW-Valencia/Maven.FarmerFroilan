package com.zipcodewilmington.froilansfarm.Persons;

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
    public void eat(Produce food, int amount) {

    }

    @Override
    public boolean hasEaten() {
        return false;
    }

    @Override
    public void makesNoise() {

    }

    @Override
    public boolean mount(T ride) {
        return false;
    }

    @Override
    public boolean ride(T ride) {
        return false;
    }

    @Override
    public boolean disMount(T ride) {
        return false;
    }
    public void fly(Boolean isFlying){

    }




}
