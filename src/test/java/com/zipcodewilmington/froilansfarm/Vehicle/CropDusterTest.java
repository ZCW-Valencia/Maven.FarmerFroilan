package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import org.junit.Test;

public class CropDusterTest {

    //CropDuster Inheritance test
    @Test
    public void cropDusterInheritanceTest1() {
        CropDuster cropDuster = (CropDuster) (Object)new CropDuster(false, false, false);
        org.junit.Assert.assertTrue(cropDuster instanceof CropDuster);
    }

    @Test
    public void farmVehicleInheritanceTest2() {
        FarmVehicle cropDuster = (FarmVehicle) (Object)new CropDuster(false, false, false);
        org.junit.Assert.assertTrue(cropDuster instanceof FarmVehicle);
    }

    @Test
    public void rideableInheritanceTest3() {
        CropDuster cropDuster = new CropDuster(false, false, false);
        org.junit.Assert.assertTrue(cropDuster instanceof Rideable);
    }

    @Test
    public void noiseMakerImplementsTest() {
        CropDuster cropDuster = new CropDuster(false, false, false);
        org.junit.Assert.assertTrue(cropDuster instanceof NoiseMaker);
    }

    //CropDuster Fields Testing
    @Test
    public void testIsMountedFalse(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted

        org.junit.Assert.assertFalse(cropDuster.getIsMounted());
    }

    @Test
    public void testIsMountedTrue(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Pilot froilanda = new Pilot("Froilanda");    //name and isFlying
        froilanda.mount(cropDuster);


        org.junit.Assert.assertTrue(cropDuster.getIsMounted());
    }

    @Test
    public void testIsBeingRiddenFalse(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted

        org.junit.Assert.assertFalse(cropDuster.getIsBeingRidden());
    }

    @Test
    public void testIsBeingRiddenTrue(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Pilot froilanda = new Pilot("Froilanda");    //name and isFlying
        froilanda.ride(cropDuster);

        org.junit.Assert.assertTrue(cropDuster.getIsBeingRidden());
    }

    @Test
    public void testIsDismountedFalse(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted

        org.junit.Assert.assertFalse(cropDuster.getIsDismounted());
    }

    @Test
    public void testIsDismountedTrue(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Pilot froilanda = new Pilot("Froilanda");    //name and isFlying
        froilanda.dismount(cropDuster);

        org.junit.Assert.assertTrue(cropDuster.getIsDismounted());
    }

    //CropDuster makeNoise
    @Test
    public void testMakeNoise(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted
        String expected = cropDuster.makeNoise();

        org.junit.Assert.assertEquals(expected, cropDuster.makeNoise());
    }

    //CropDuster method testing
//    @Test
//    public void testIsFlyingFalse(){
//        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted
//
//        Assert.assertFalse(cropDuster.flying(cropDuster.isBeingRidden));
//    }

//    @Test
//    public void testIsFlyingTrue(){
//        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted
//        Pilot froilanda = new Pilot("Froilanda", false);    //name and isFlying
//        cropDuster.setIsBeingRidden(froilanda.ride());
//
//        Assert.assertTrue(cropDuster.flying(cropDuster.isBeingRidden));
//    }

    @Test
    public void testFertilizeFalse(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted
        CropRow cropRow = new CropRow(false, false);
        cropDuster.fertilize(cropRow);  //doing the fert

        org.junit.Assert.assertFalse(cropRow.getHasBeenFertilized());


    }

    @Test
    public void testFertilizeTrue(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted
        CropRow cropRow = new CropRow(false, false);
        Pilot froilanda = new Pilot("Froilanda");    //name and isFlying
        froilanda.ride(cropDuster);
        cropDuster.fertilize(cropRow);  //doing the  fert

        org.junit.Assert.assertTrue(cropRow.getHasBeenFertilized());

    }
}
