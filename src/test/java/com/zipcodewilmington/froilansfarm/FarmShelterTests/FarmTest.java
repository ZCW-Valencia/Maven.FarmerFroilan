package com.zipcodewilmington.froilansfarm.FarmShelterTests;
import com.zipcodewilmington.froilansfarm.FarmShelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.FarmShelter.Farm;
import com.zipcodewilmington.froilansfarm.FarmShelter.Stable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
<<<<<<< HEAD
//import sun.jvm.hotspot.utilities.Assert;
=======
>>>>>>> 6fe0979a409e8701edf9c21c9b9cb5b99c3fbf78

public class FarmTest {
    private Farm farm;

    @Before
    public void setUp() {
        farm = new Farm();
    }

    @Test
    public void testFarmInitialization() {
        Farm farm = new Farm();

        Assert.assertEquals(farm.getFarmHouse()); // expected 1 FarmHouse
        Assert.assertEquals(4, farm.getChickenCoop().size()); // expected 4 ChickenCoops
        Assert.assertEquals(3, farm.getStable().size()); // expected 3 Stables
    }

    @Test
    public void testAddStable() { //Add Stable Farm Test
        Farm farm = new Farm();
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();

        farm.add(stable1); //Adding new stable to Farm
        farm.add(stable2); //Adding new stable to Farm
        farm.add(stable3); //Adding new stable to Farm

        Assert.assertTrue(farm.get().contains(stable1, stable2, stable3)); // Farm should have 3 Stable after addition
    }

    @Test
    public void testRemoveStable() { //Remove Stable Farm Test
        Farm farm = new Farm();
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();


        farm.add(stable1);
        farm.add(stable2);
        farm.add(stable3);
        farm.remove(stable2); //Removing Stable from Farm

        Assert.assertFalse(farm.contains(stable2)); //Farm should not contain stable2 after removal
    }

    @Test
    public void testGetStable() { //Get Stable Farm Test
        Farm farm = new Farm();
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();

        farm.add(stable1);
        farm.add(stable2);
        farm.add(stable3);

        Assert.assertEquals(stable1, farm.get(0)); //Should retrieve/get stable1 by index 0
        Assert.assertEquals(stable2, farm.get(1)); //Should retrieve/get stable2 by index 1
        Assert.assertEquals(stable3, farm.get(2)); //Should retrieve/get stable2 by index 2
    }

    @Test
    public void testAddChickenCoop() { //Add ChickenCoop Farm Test
        Farm farm = new Farm();
        ChickenCoop chickencoop1 = new ChickenCoop();
        ChickenCoop chickencoop2 = new ChickenCoop();
        ChickenCoop chickencoop3 = new ChickenCoop();

        farm.add(chickencoop1); //Adding new stable to Farm
        farm.add(chickencoop2); //Adding new stable to Farm
        farm.add(chickencoop3); //Adding new stable to Farm

        Assert.assertTrue(farm.get().contains(chickencoop1, chickencoop2, chickencoop3));
    }

    @Test
    public void testRemoveChickenCoop() { //Remove ChickenCoop Farm Test
        Farm farm = new Farm();
        ChickenCoop chickencoop1 = new ChickenCoop();
        ChickenCoop chickencoop2 = new ChickenCoop();

        farm.add(chickencoop1);
        farm.add(chickencoop2);
        farm.remove(chickencoop2); //Removing ChickenCoop2 from Farm

        Assert.assertFalse(farm.get().contains(chickencoop2)); //Farm should not contain chickencoop2 after removal
    }

    @Test
    public void testGetChickenCoop() { //Get ChickenCoop Farm Test
        Farm farm = new Farm();
        ChickenCoop chickencoop1 = new ChickenCoop();
        ChickenCoop chickencoop2 = new ChickenCoop();

        farm.add(chickencoop1);
        farm.add(chickencoop2);

        Assert.assertEquals(chickencoop1, farm.get(0)); //Should retrieve/get chickencoop1 by index 0
        Assert.assertEquals(chickencoop2, farm.get(1)); //Should retrieve/get chickencoop2 by index 1
    }

}