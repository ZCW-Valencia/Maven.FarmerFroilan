package com.zipcodewilmington.froilansfarm.Animals;

public class Chicken extends Animal implements Produce {
    /*
    Need the following instance variables:
    bool hasBeenFertilized

    Needs the following methods:
    makeNoise()
    eat()
    yield()
     */
    private boolean hasBeenFertilized;

    public Chicken() {
        hasBeenFertilized = false;
    }


}
