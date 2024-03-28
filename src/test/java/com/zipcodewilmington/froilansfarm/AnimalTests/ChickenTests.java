package com.zipcodewilmington.froilansfarm.AnimalTests;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class ChickenTests {

    @Test
    public void chickenInheritanceTest1() {
        Animal chicken = (Animal)(Object)new Chicken();
        Assert.assertTrue(chicken instanceof Animal);
    }

    @Test
    public void chickenImplementsTest2() {
        NoiseMaker chicken = (NoiseMaker)(Object)new Chicken();
        Assert.assertTrue(chicken instanceof NoiseMaker);
    }

    @Test
    public void chickenImplementsTest3() {
        Eater chicken = (Eater)(Object)new Chicken();
        Assert.assertTrue(chicken instanceof Eater);
    }

    @Test
    public void chickenImplementsTest4() {
        Produce chicken = (Produce)(Object)new Chicken();
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
