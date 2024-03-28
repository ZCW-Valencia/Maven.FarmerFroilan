package com.zipcodewilmington.froilansfarm;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.jvm.hotspot.utilities.Assert;

public class ChickenCoopTest {
    private ChickenCoop chickenCoop;
    @Before
    public void setUp(){
        chickenCoop = new ChickenCoop();
    }

    @Test
    public void testAddChicken(){ // Add Chicken ChickenCoop Test
        Chicken chicken = new Chicken();

        chickenCoop.addChicken(chicken); // Adding new chicken to ChickenCoop

        Assert.assertEquals(1, chickenCoop.size()); // ChickenCoop should have 1 chicken after addition
    }

    @Test
    public void testRemoveChicken(){ // Remove Chicken ChickenCoop Test
        Chicken chicken = new Chicken();

        chickenCoop.addChicken(chicken); // Adding new chicken to ChickenCoop
        chickenCoop.removeChicken(chicken); // Removing chicken from ChickenCoop

        Assert.assertFalse(chickenCoop.contains(chicken)); // ChickenCoop should not contain chicken after removal
    }

    @Test
    public void testGetChicken(){ // Get Chicken ChickenCoop Test
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        Chicken chicken4 = new Chicken();


        chickenCoop.addChicken(chicken1);
        chickenCoop.addChicken(chicken2);
        chickenCoop.addChicken(chicken3);
        chickenCoop.addChicken(chicken4);

        Assert.assertEquals(chicken1, chickenCoop.get(0)); //Should retrieve/get chicken1 by index 0
        Assert.assertEquals(chicken4, chickenCoop.get(3)); //Should retrieve/get chicken4 by index 3
    }

    @Test
    public void testChickenCoopSize(){ // ChickenCoop Size Test
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();

        chickenCoop.addChicken(chicken1);
        chickenCoop.addChicken(chicken2);
        chickenCoop.addChicken(chicken3);

        Assert.assertEquals(3, chickenCoop.size()); // ChickenCoop should have 3 chickens after addition
    }

    @Test
    public void testChickenCoopContains(){  // ChickenCoop Contains Test
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();

        chickenCoop.addChicken(chicken1);
        chickenCoop.addChicken(chicken2);

        Assert.assertTrue(chickenCoop.contains(chicken1, chicken2)); // ChickenCoop should contain chicken1 and chicken2
    }
}


