package com.zipcodewilmington.froilansfarm.AnimalTests;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Produce;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class ChickenTests {
    boolean hasEaten;

    @Test
    public void chickenInheritanceTest1() {
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Animal);
    }

    @Test
    public void chickenImplementsTest2() {
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof NoiseMaker);
    }

    @Test
    public void chickenImplementsTest3() {
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Eater);
    }

    @Test
    public void chickenImplementsTest4() {
        Chicken chicken = new Chicken();
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
    public void eatTest1() {
        Chicken chicken = new Chicken();
        Crop corn = new Crop();

        chicken.eat(corn, 1);

        Assert.assertTrue(hasEaten);
    }

    @Test
    public void eatTest2() {
        Chicken chicken = new Chicken();
        Crop corn = new Crop();

        chicken.eat(corn, 0);

        Assert.assertFalse(hasEaten);
    }

    @Test
    public void yieldTest1() {
        Chicken chicken = new Chicken();
        boolean hasBeenFertilized = true;

        int ex
        int actualYield = chicken.yield();
        Assert.assertEquals(expectedYield, actualYield);
    }

    @Test
    public void yieldTest2() {
        Chicken chicken = new Chicken();
        boolean hasBeenFertilized = true;
    }
}
