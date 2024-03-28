package com.zipcodewilmington.froilansfarm.PersonTest;

import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void inheritancePerson(){
        Person farmer =(Person)(Object) new Farmer("Farmer1");
        Assert.assertTrue(farmer instanceof Person);
    }

    @Test
    public void TestPlant(){
        Crop crop = new Crop();
        Farmer farmer = new Farmer("Farmer1");
        Assert.assertTrue(farmer.plant(crop));

    }

    @Test
    public void TestMount(){
        Farmer farmer = new Farmer("Farmer1");
        Tractor tractor = new Tractor();
        Assert.assertTrue(farmer.mount(tractor));
    }

    @Test
    public void TestRide(){
        Farmer farmer = new Farmer("Farmer1");
        Tractor tractor = new Tractor();
        Assert.assertTrue(farmer.ride(tractor));
        Assert.assertTrue(farmer.isBeingRidden());
    }

    @Test
    public void TestDismount(){
        Farmer farmer = new Farmer("Farmer1");
        Tractor tractor = new Tractor();
        Assert.assertTrue(farmer.dismount(tractor));
        Assert.assertFalse(farmer.isBeingRidden());
    }

}
