package com.zipcodewilmington.froilansfarm.Animals;

public abstract class Animal implements Rideable, Eater, NoiseMaker {
    /*
    Needs the following instance variables:
    bool hasEaten

    Needs the following methods:
    makeNoise()
    eat()
     */
    boolean hasEaten;

    abstract String makeNoise();

    abstract boolean eat(T food, int amount);
}
