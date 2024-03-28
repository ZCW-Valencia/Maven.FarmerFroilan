package com.zipcodewilmington.froilansfarm.PersonTest;

import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

    @Test
    public void TestInheritance(){
        Person pilot =(Person)(Object) new Pilot("pilot");
        Assert.assertTrue(pilot instanceof Person);
    }

    @Test
    public void TestPilotInterface(){
        Person pilot =(Person)(Object) new Pilot("Farmer1");
        Assert.assertTrue(pilot instanceof NoiseMaker);
    }

    @Test
    public void TestPilotInterface(){
        Person pilot =(Person)(Object) new Pilot("Farmer1");
        Assert.assertTrue(pilot instanceof Eater);
    }

    @Test
    public void TestFly(){
        Pilot pilot = new Pilot("pilot");
        Boolean expected = false;
        Assert.assertEquals(expected,pilot.getFlying());

    }
    @Test
    public void TestMount(){
        Pilot pilot = new Pilot("pilot");
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(pilot.mount(cropDuster));
    }

    @Test
    public void TestRide(){
        Pilot pilot = new Pilot("pilot");
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(pilot.ride(cropDuster));
        Assert.assertTrue(cropDuster.isBeingRidden());
    }

    @Test
    public void TestDismount(){
        Pilot pilot = new Pilot("pilot");
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(pilot.dismount(cropDuster));
        Assert.assertFalse(cropDuster.isBeingRidden());
    }

}
