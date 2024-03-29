package com.zipcodewilmington.froilansfarm.FarmShelterTests;
import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.FarmShelter.ChickenCoop;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenCoopTest {
    private ChickenCoop<Chicken> chickenCoop;
    @Before
    public void setUp(){
        chickenCoop = new ChickenCoop<>();
    }

    @Test
    public void testAddChicken(){ // Add Chicken ChickenCoop Test
        Chicken chicken = new Chicken();

        chickenCoop.add(chicken); // Adding new chicken to ChickenCoop

        Assert.assertTrue(chickenCoop.contains(chicken)); // ChickenCoop should contain chicken after addition
    }

    @Test
    public void testRemoveChicken(){ // Remove Chicken ChickenCoop Test
        Chicken chicken = new Chicken();

        chickenCoop.add(chicken); // Adding new chicken to ChickenCoop
        chickenCoop.remove(chicken); // Removing chicken from ChickenCoop

        Assert.assertTrue(chickenCoop.remove(chicken)); // Removed chicken from ChickenCoop
        Assert.assertFalse(chickenCoop.contains(chicken)); // ChickenCoop should not contain chicken after removal
    }

    @Test
    public void testGetChicken(){ // Get Chicken ChickenCoop Test
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        Chicken chicken4 = new Chicken();


        chickenCoop.add(chicken1);
        chickenCoop.add(chicken2);
        chickenCoop.add(chicken3);
        chickenCoop.add(chicken4);

        Assert.assertEquals(chicken1, chickenCoop.get(0)); //Should retrieve/get chicken1 by index 0
        Assert.assertEquals(chicken4, chickenCoop.get(3)); //Should retrieve/get chicken4 by index 3
    }

    @Test
    public void testChickenCoopSize(){ // ChickenCoop Size Test
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();

        chickenCoop.add(chicken1);
        chickenCoop.add(chicken2);
        chickenCoop.add(chicken3);

        Assert.assertEquals(3, chickenCoop.size()); // ChickenCoop should have 3 chickens after addition
    }

    @Test
    public void testChickenCoopContains(){  // ChickenCoop Contains Test
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();

        chickenCoop.add(chicken1);

        Assert.assertTrue(chickenCoop.contains(chicken1)); // ChickenCoop should contain chicken1
        Assert.assertFalse(chickenCoop.contains(chicken2)); // ChickenCoop should not contain chicken2
    }
}


