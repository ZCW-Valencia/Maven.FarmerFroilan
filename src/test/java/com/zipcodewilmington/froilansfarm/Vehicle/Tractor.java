package com.zipcodewilmington.froilansfarm.Vehicle;

import org.junit.Test;
import sun.jvm.hotspot.utilities.Assert;

public class Tractor {

    //Tractor Inheritance test
    @Test
    public void tractorInheritanceTest1() {
        Tractor tractor = (Tractor) (Object)new Tractor();
        org.junit.Assert.assertTrue(tractor instanceof Tractor);
    }

    //Tractor Instance Fields testing
    @Test
    public void testIsMountedFalse(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted

        Assert.assertFalse(tractor.isMounted());

    }

    @Test
    public void testIsMountedTrue(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Farmer froilan = new Farmer("Froilan");
        tractor.setIsMounted(froilan.mount());  //assuming mount() is true, set mount() should just return true

        Assert.assertTrue(tractor.isMounted());

    }

    @Test
    public void testIsBeingRiddenFalse(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted

        Assert.assertFalse(tractor.isBeingRidden());
    }

    @Test
    public void testIsBeingRiddenTrue(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Farmer froilan = new Farmer("Froilan");
        tractor.setIsBeingRidden(froilan.ride()); //ride() should just return true

        Assert.assertTrue(tractor.isBeingRidden());
    }

    @Test
    public void testIsDismountedFalse(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted

        Assert.assertFalse(tractor.isDismounted());
    }

    @Test
    public void testIsDismountedTrue(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Farmer froilan = new Farmer("Froilan");
        tractor.setIsDismounted(froilan.disMount()); //disMount() should just return true

        Assert.assertTrue(tractor.isDismounted());
    }

    //Tractor makeNoise
    @Test
    public void testMakeNoise(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted
        String expected = tractor.makeNoise();

        Assert.assertEquals(expected, tractor.makeNoise());
    }

    //Tractor harvest method
    @Test
    public void testHarvestFalse(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Field field = new Field();

        Assert.assertFalse(tractor.harvest(t cropRow, field.getHasBeenFertilized()));
        // doesnt matter which crop, if either hasBeenFertilized or isBeingRidden is false, whole thing false
        //this.IsBeingRidden is going to called in the method, no need as para
    }

    @Test
    public void testHarvestFalse2(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Field field = new Field(false, false, false); //hasBeenPlanted, hasBeenFertilized, hasBeenHarvested
        Farmer froilan = new Farmer("Froilan");
        tractor.setIsBeingRidden(froilan.ride()); //ride() should just return true

        Assert.assertFalse(tractor.harvest(t cropRow, field.getHasBeenFertilized()));
        // doesnt matter which crop, if either hasBeenFertilized or isBeingRidden is false, whole thing false
        //this.IsBeingRidden is going to called in the method, no need as para
    }

    @Test
    public void testHarvestFalse3(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Field field = new Field(false, false, false); //hasBeenPlanted, hasBeenFertilized, hasBeenHarvested
        field.setHasBeenFertilized(true);

        Assert.assertFalse(tractor.harvest(t cropRow, field.getHasBeenFertilized()));
        // doesnt matter which crop, if either hasBeenFertilized or isBeingRidden is false, whole thing false
        //this.IsBeingRidden is going to called in the method, no need as para
    }

    @Test
    public void testHarvestTrue(){
        Tractor tractor = new Tractor(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Field field = new Field(false, false, false); //hasBeenPlanted, hasBeenFertilized, hasBeenHarvested
        field.setHasBeenFertilized(true);
        Farmer froilan = new Farmer("Froilan");
        tractor.setIsBeingRidden(froilan.ride()); //ride() should just return true

        Assert.assertTrue(tractor.harvest(t cropRow, field.getHasBeenFertilized()));
        //doesnt matter which crop, both hasBeenFertilized and isBeingRidden need to be true
        //this.IsBeingRidden is going to called in the method, no need as para
    }
}
