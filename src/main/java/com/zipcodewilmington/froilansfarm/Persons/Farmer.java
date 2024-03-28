package com.zipcodewilmington.froilansfarm.Persons;

//import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

public class Farmer extends Person implements Rider, Botanist {
    Tractor tractor = new Tractor();

    public Farmer(String name) {
        super(name);
    }

    @Override
    public void eat(Produce food, int amount) {

    }

    @Override
    public boolean hasEaten() {
        return true;
    }

    @Override
    public void makesNoise() {

    }

    @Override
    public boolean plant(Crop crop) {
        return true;
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
}
