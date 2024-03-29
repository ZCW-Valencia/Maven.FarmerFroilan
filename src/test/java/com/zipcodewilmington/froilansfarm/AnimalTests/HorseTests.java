package com.zipcodewilmington.froilansfarm.AnimalTests;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class HorseTests {

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
    public void horseNonNullaryConstructorTest() {
        boolean expectedParam1 = false;
        boolean expectedParam2 = true;
        boolean expectedParam3 = false;

        Horse horse = new Horse(expectedParam1, expectedParam2, expectedParam3);

        Assert.assertEquals(expectedParam1, horse.getIsMounted());
        Assert.assertEquals(expectedParam2, horse.getIsBeingRidden());
        Assert.assertEquals(expectedParam3, horse.getIsDismounted());
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
        int amount = 5;

        horse.eat(corn, amount);

        Assert.assertTrue(horse.hasEaten());
    }

    @Test
    public void eatTest2() {
        Horse horse = new Horse();
        Crop corn = new Crop();
        int amount = 0;

        horse.eat(corn, amount);

        Assert.assertFalse(horse.hasEaten());
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
