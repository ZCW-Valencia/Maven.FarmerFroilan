package com.zipcodewilmington.froilansfarm.Persons;

public class Farmer extends Person implements Rider,Botanist{
    Tractor tractor = new Tractor();

    public Farmer(String name) {
        super(name);
    }


    @Override
    public void eat(T food, int amount) {

    }

    @Override
    public boolean hasEaten() {
        return false;
    }

    @Override
    public void makesNoise() {

    }
}
