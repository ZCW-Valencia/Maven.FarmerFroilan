package com.zipcodewilmington.froilansfarm.AnimalTests;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Corn;
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
        int amount = 5;

        horse.eat(corn, amount);

        Assert.assertTrue(horse.getHasEaten());
    }

    @Test
    public void eatTest2() {
        Horse horse = new Horse();
        Corn corn = new Corn();
        int amount = 0;

        horse.eat(corn, amount);

        Assert.assertFalse(horse.getHasEaten());
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

    @Test
    public void getIsMountedTest1() {
        Horse horse = new Horse();
        Farmer farmer = new Farmer("froilan");

        farmer.mount(horse);

        Assert.assertTrue(horse.getIsMounted());
    }

    @Test
    public void getIsMountedTest2() {
        Horse horse = new Horse();

        Assert.assertFalse(horse.getIsMounted());
    }

    @Test
    public void getIsBeingRiddenTest1() {
        Horse horse = new Horse();
        Farmer farmer = new Farmer("froilan");

        farmer.ride(horse);

        Assert.assertTrue(horse.getIsBeingRidden());
    }

    @Test
    public void getIsBeingRiddenTest2() {
        Horse horse = new Horse();

        Assert.assertFalse(horse.getIsBeingRidden());
    }

    @Test
    public void getIsDisMountedTest() {
        Horse horse = new Horse();
        Farmer farmer = new Farmer("froilan");

        farmer.mount(horse);
        farmer.dismount(horse);

        Assert.assertTrue(horse.getIsDismounted());
    }

    @Test
    public void getIsDismountedTest2() {
        Horse horse = new Horse();

        Assert.assertFalse(horse.getIsDismounted());
    }
}
