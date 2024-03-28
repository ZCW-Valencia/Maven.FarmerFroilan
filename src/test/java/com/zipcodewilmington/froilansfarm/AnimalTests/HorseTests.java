package com.zipcodewilmington.froilansfarm.AnimalTests;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import org.junit.Assert;
import org.junit.Test;

public class HorseTests {
    boolean hasEaten;


    @Test
    public void horseInheritanceTest1() {
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Animal);
    }

    @Test
    public void horseInheritanceTest2() {
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Rideable);
    }

    @Test
    public void horseImplementationTest1() {
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof NoiseMaker);
    }

    @Test
    public void horseImplementationTest2() {
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Eater);
    }

    @Test
    public void horseConstructorTest() {


    }

    @Test
    public void makeNoiseTest() {
        Horse horse = new Horse();
        String expectedNoise = "Neigh!";
        String actualNoise = horse.makeNoise();
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void eatTest1() {
        Horse horse = new Horse();
        Crop corn = new Crop();

        horse.eat(corn, 5);

        Assert.assertTrue(hasEaten);
    }

    @Test
    public void eatTest2() {
        Horse horse = new Horse();
        Crop corn = new Crop();

        horse.eat(corn, 1);

        Assert.assertFalse(hasEaten);
    }

    @Test
    public void exerciseTest1() {
        Horse horse = new Horse(true, true, false);
        boolean result = horse.exercise();

        Assert.assertTrue(result);
    }

    @Test
    public void exerciseTest2() {
        Horse horse = new Horse(false, false, true);
        boolean result = horse.exercise();

        Assert.assertFalse(result);
    }
}
