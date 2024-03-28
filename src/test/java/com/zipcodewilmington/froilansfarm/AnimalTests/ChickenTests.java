package com.zipcodewilmington.froilansfarm.AnimalTests;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class ChickenTests {

    // If Animal extends Rideable, does Chicken inherit those methods?

    @Test
    public void chickenInheritanceTest1() {
        Animal chicken = (Animal)(Object)new chicken();
        Assert.assertTrue(chicken instanceof Animal);
    }

    @Test
    public void chickenImplementsTest2() {
        NoiseMaker chicken = (NoiseMaker)(Object)new chicken();
        Assert.assertTrue(chicken instanceof NoiseMaker);
    }

    @Test
    public void chickenImplementsTest3() {
        Eater chicken = (Eater)(Object)new chicken();
        Assert.assertTrue(chicken instanceof Eater);
    }

    @Test
    public void chickenImplementsTest4() {
        Produce chicken = (Produce)(Object)new chicken();
        Assert.assertTrue(chicken instanceof Produce);
    }

    @Test
    public void makeNoiseTest() {
        Chicken chicken = new Chicken();
        String expectedNoise = "Cluck!";
        String actualNoise = chicken.makeNoise();
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void eatTest() { // This test is intertwined with the hasEaten test
        Chicken chicken = new Chicken();
    }

    @Test
    public void hasEatenTest() { // Need more information. What do chickens eat and how much?
        Chicken chicken = new Chicken();

        chicken.eat();
        boolean result = chicken.hasEaten();

        Assert.assertTrue(result);
    }

    @Test
    public void yieldTest1() {
        Chicken chicken = new Chicken();
        boolean hasBeenFertilized = true;

        Object egg = chicken.yield();

        assertNotNull(egg);
    }

    @Test
    public void yieldTest2() {
        Chicken chicken = new Chicken();
        boolean hasBeenFertilized = false;

        Object egg = chicken.yield();

        assertNull(egg);
    }
}
