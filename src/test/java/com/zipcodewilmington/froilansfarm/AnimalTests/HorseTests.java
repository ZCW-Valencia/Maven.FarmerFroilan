package com.zipcodewilmington.froilansfarm.AnimalTests;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
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
    public void makeNoiseTest() {
        Horse horse = new Horse();
        String expectedNoise = "Neigh!";
        String actualNoise = horse.makeNoise();
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void eatTest1() {
        Horse horse = new Horse();
        Corn corn = new Corn();
        boolean hasEaten = true;

        boolean result = horse.eat();

        Assert.assertTrue(result);
    }

    @Test
    public void eatTest2() {
        Horse horse = new Horse();
        Corn corn = new Corn();
        boolean hasEaten = false;

        boolean result = horse.eat();

        Assert.assertFalse(result);
    }

    @Test
    public void getIsMountedTest1() {
        Horse horse = new Horse();
        boolean isMounted = true;

        boolean result = horse.getIsMounted();

        Assert.assertTrue(result);
    }

    @Test
    public void getIsMountedTest2() {
        Horse horse = new Horse();
        boolean isMounted = false;

        boolean result = horse.getIsMounted();

        Assert.assertFalse(result);
    }

    @Test
    public void getIsBeingRiddenTest1() {
        Horse horse = new Horse();
        boolean isBeingRidden = true;

        boolean result = horse.getIsBeingRidden();

        Assert.assertTrue(result);
    }

    @Test
    public void getIsBeingRiddenTest2() {
        Horse horse = new Horse();
        boolean isBeingRidden = false;

        boolean result = horse.getIsBeingRidden();

        Assert.assertFalse(result);
    }

    @Test
    public void getIsDismountedTest1() {
        Horse horse = new Horse();
        boolean isDismounted = true;

        boolean result = horse.getIsDismounted();

        Assert.assertTrue(result);
    }

    @Test
    public void getIsDismountedTest2() {
        Horse horse = new Horse();
        boolean isDismounted = false;

        boolean result = horse.getIsDismounted();

        Assert.assertFalse(result);
    }

    @Test
    public void exerciseTest1() {
        Horse horse = new Horse();
        boolean isBeingRidden = true;

        boolean result = horse.exercise();

        Assert.assertTrue(result);
    }

    @Test
    public void exerciseTest2() {
        Horse horse = new Horse();
        boolean isBeingRidden = false;

        boolean result = horse.exercise();

        Assert.assertFalse(result);
    }
}
