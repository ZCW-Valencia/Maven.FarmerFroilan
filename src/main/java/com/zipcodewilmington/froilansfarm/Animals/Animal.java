package com.zipcodewilmington.froilansfarm.Animals;

public abstract class Animal implements Rideable, Eater, NoiseMaker {
    /*
    Needs the following instance variables:
    bool hasEaten

    Needs the following methods:
    makeNoise()
    eat()
     */
    Boolean hasEaten;

    abstract void makeNoise();

    abstract void eat();
}
