package com.zipcodewilmington.froilansfarm.FarmShelterTests;
import com.zipcodewilmington.froilansfarm.FarmShelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.FarmShelter.Farm;
import com.zipcodewilmington.froilansfarm.FarmShelter.Stable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FarmTest {
    private Farm farm;
    @Before
    public void setUp() {
        farm = new Farm();
    }
    @Test
    public void testAddStable() { //Add Stable Farm Test
        Stable stable = new Stable();

        farm.addStable(stable); //Adding new stable to Farm

        Assert.assertTrue(farm.getStable().contains(stable)); // Farm should contain stable after addition
    }

    @Test
    public void testRemoveStable() { //Remove Stable Farm Test

        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();


        farm.addStable(stable1);
        farm.addStable(stable2);
        farm.addStable(stable3);
        farm.removeStable(stable2); //Removing Stable from Farm

        Assert.assertFalse(farm.getStable().contains(stable2)); //Farm should not contain stable2 after removal
    }

    @Test
    public void testGetStable() { //Get Stable Farm Test
        Stable stable = new Stable();

        farm.addStable(stable);

        Assert.assertEquals(stable, farm.getStable()); //Should retrieve/get stable1 by index 0
    }

    @Test
    public void testAddChickenCoop() { //Add ChickenCoop Farm Test
        ChickenCoop chickencoop = new ChickenCoop();

        farm.addChickenCoop(chickencoop); //Adding new stable to Farm

        Assert.assertTrue(farm.getChickenCoop().contains(chickencoop));
    }

    @Test
    public void testRemoveChickenCoop() { //Remove ChickenCoop Farm Test

        ChickenCoop chickencoop1 = new ChickenCoop();
        ChickenCoop chickencoop2 = new ChickenCoop();

        farm.addChickenCoop(chickencoop1);
        farm.addChickenCoop(chickencoop2);
        farm.removeChickenCoop(chickencoop2); //Removing ChickenCoop2 from Farm

        Assert.assertFalse(farm.getChickenCoop().contains(chickencoop2)); //Farm should not contain chickencoop2 after removal
    }

    @Test
    public void testGetChickenCoop() { //Get ChickenCoop Farm Test

        ChickenCoop chickencoop1 = new ChickenCoop();
        ChickenCoop chickencoop2 = new ChickenCoop();

        farm.addChickenCoop(chickencoop1);
        farm.addChickenCoop(chickencoop2);

        Assert.assertEquals(chickencoop1, farm.getChickenCoop()); //Should retrieve/get chickencoop1 by index 0
        Assert.assertEquals(chickencoop2, farm.getChickenCoop()); //Should retrieve/get chickencoop2 by index 1
    }

}