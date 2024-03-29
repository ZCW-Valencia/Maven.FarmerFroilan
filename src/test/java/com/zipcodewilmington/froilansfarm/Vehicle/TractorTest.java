package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import org.junit.Test;


import java.util.ArrayList;

public class TractorTest {

    //Tractor Inheritance test
    @Test
    public void tractorInheritanceTest1() {
        Tractor tractor = (Tractor) (Object)new Tractor(false, false, false);
        org.junit.Assert.assertTrue(tractor instanceof Tractor);
    }

    @Test
    public void farmVehicleInheritanceTest2() {
        FarmVehicle tractor = (FarmVehicle) (Object)new Tractor(false, false, false);
        org.junit.Assert.assertTrue(tractor instanceof FarmVehicle);
    }

    @Test
    public void rideableInheritanceTest3() {
        Tractor tractor = new Tractor(false, false, false);
        org.junit.Assert.assertTrue(tractor instanceof Rideable);
    }


    @Test
    public void noiseMakerImplementsTest() {
        Tractor tractor = new Tractor(false, false, false);
        org.junit.Assert.assertTrue(tractor instanceof NoiseMaker);
    }


    //Tractor Instance Fields testing
    @Test
    public void testIsMountedFalse(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted

        org.junit.Assert.assertFalse(tractor.getIsMounted());

    }

    @Test
    public void testIsMountedTrue(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Farmer froilan = new Farmer("Froilan");
        froilan.mount(tractor);

        org.junit.Assert.assertTrue(tractor.getIsMounted());

    }

    @Test
    public void testIsBeingRiddenFalse(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted

        org.junit.Assert.assertFalse(tractor.getIsBeingRidden());
    }

    @Test
    public void testIsBeingRiddenTrue(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Farmer froilan = new Farmer("Froilan");
        froilan.ride(tractor);

        org.junit.Assert.assertTrue(tractor.getIsBeingRidden());
    }

    @Test
    public void testIsDismountedFalse(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted

        org.junit.Assert.assertFalse(tractor.getIsDismounted());
    }

    @Test
    public void testIsDismountedTrue(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Farmer froilan = new Farmer("Froilan");
        froilan.dismount(tractor);

        org.junit.Assert.assertTrue(tractor.getIsDismounted());
    }

    //Tractor makeNoise
    @Test
    public void testMakeNoise(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted
        String expected = tractor.makeNoise();

        org.junit.Assert.assertEquals(expected, tractor.makeNoise());
    }

    //Tractor harvest method
    @Test
    public void testHarvestFalse(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted
        CropRow cropRow = new CropRow<>(false, false);
        tractor.harvest(cropRow);   //doing the harv

        org.junit.Assert.assertFalse(cropRow.getHasBeenHarvested());
    }

    @Test
    public void testHarvestTrue(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted
        CropRow cropRow = new CropRow<>(false, false);
        Farmer froilan = new Farmer("Froilan");
        froilan.ride(tractor);
        tractor.harvest(cropRow);

        org.junit.Assert.assertTrue(cropRow.getHasBeenHarvested());
    }
}
