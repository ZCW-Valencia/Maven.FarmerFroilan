package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import org.junit.Test;
import org.junit.Assert;

public class CropDusterTest {

    //CropDuster Inheritance test
    @Test
    public void cropDusterInheritanceTest1() {
        CropDuster cropDuster = (CropDuster) (Object)new CropDuster();
        org.junit.Assert.assertTrue(cropDuster instanceof CropDuster);
    }

    //CropDuster Fields Testing
    @Test
    public void testIsMountedFalse(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted

        Assert.assertFalse(cropDuster.isMounted());
    }

    @Test
    public void testIsMountedTrue(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Pilot froilanda = new Pilot("Froilanda", false);    //name and isFlying
        cropDuster.setIsMounted(froilanda.mount());  //assuming mount() is true, set mount() should just return true

        Assert.assertTrue(cropDuster.isMounted());
    }

    @Test
    public void testIsBeingRiddenFalse(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted

        Assert.assertFalse(cropDuster.isBeingRidden());
    }

    @Test
    public void testIsBeingRiddenTrue(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Pilot froilanda = new Pilot("Froilanda", false);    //name and isFlying
        cropDuster.setIsBeingRidden(froilanda.ride());

        Assert.assertTrue(cropDuster.isBeingRidden());
    }

    @Test
    public void testIsDismountedFalse(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted

        Assert.assertFalse(cropDuster.isDismounted());
    }

    @Test
    public void testIsDismountedTrue(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Pilot froilanda = new Pilot("Froilanda", false);    //name and isFlying
        cropDuster.setIsDismounted(froilanda.disMount());

        Assert.assertTrue(cropDuster.isDismounted());
    }

    //CropDuster makeNoise
    @Test
    public void testMakeNoise(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted
        String expected = cropDuster.makeNoise();

        Assert.assertEquals(expected, cropDuster.makeNoise());
    }

    //CropDuster method testing
    @Test
    public void testIsFlyingFalse(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted

        Assert.assertFalse(cropDuster.flying(cropDuster.isBeingRidden));
    }

    @Test
    public void testIsFlyingTrue(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Pilot froilanda = new Pilot("Froilanda", false);    //name and isFlying
        cropDuster.setIsBeingRidden(froilanda.ride());

        Assert.assertTrue(cropDuster.flying(cropDuster.isBeingRidden));
    }

    @Test
    public void testFertilizeFalse(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Field field = new Field(false, false, false); //hasBeenPlanted, hasBeenFertilized, hasBeenHarvested

        Assert.assertFalse(cropDuster.harvest(t cropRow, field.getHasBeenPlanted()));
        // doesnt matter which crop, if either hasBeenPlanted or isBeingRidden is false, whole thing false
        //this.IsBeingRidden is going to called in the method, no need as para
    }

    @Test
    public void testFertilizeFalse2(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Field field = new Field(false, false, false); //hasBeenPlanted, hasBeenFertilized, hasBeenHarvested
        field.setHasBeenPlanted(true);

        Assert.assertFalse(cropDuster.harvest(t cropRow, field.getHasBeenPlanted()));
        // doesnt matter which crop, if either hasBeenPlanted or isBeingRidden is false, whole thing false
        //this.IsBeingRidden is going to called in the method, no need as para
    }

    @Test
    public void testFertilizeFalse3(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Field field = new Field(false, false, false); //hasBeenPlanted, hasBeenFertilized, hasBeenHarvested
        Pilot froilanda = new Pilot("Froilanda", false);    //name and isFlying
        cropDuster.setIsBeingRidden(froilanda.ride());

        Assert.assertFalse(cropDuster.harvest(t cropRow, field.getHasBeenPlanted()));
        // doesnt matter which crop, if either hasBeenPlanted or isBeingRidden is false, whole thing false
        //this.IsBeingRidden is going to called in the method, no need as para
    }

    @Test
    public void testFertilizeTrue(){
        CropDuster cropDuster = new CropDuster(false, false, false);    //isMounted, isBeingRidden, isDismounted
        Field field = new Field(false, false, false); //hasBeenPlanted, hasBeenFertilized, hasBeenHarvested
        field.setHasBeenPlanted(true);
        Pilot froilanda = new Pilot("Froilanda", false);    //name and isFlying
        cropDuster.setIsBeingRidden(froilanda.ride());

        Assert.assertTrue(cropDuster.harvest(t cropRow, field.getHasBeenPlanted()));
        //this.IsBeingRidden is going to called in the method, no need as para

    }
}
