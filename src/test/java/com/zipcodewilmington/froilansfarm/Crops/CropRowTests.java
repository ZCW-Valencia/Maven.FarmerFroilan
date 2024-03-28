package com.zipcodewilmington.froilansfarm.Crops;
import org.junit.Test;
import org.junit.Assert;

public class CropRowTests {

    @Test
    public void getHasBeenFertilizedTest1() {
        Pilot froilanda = new Pilot("froilanda");
        Crop tomatoPlant1 = new Crop(true);
        Crop tomatoPlant2 = new Crop(true);
        Crop tomatoPlant3 = new Crop(true);
        CropDuster cropDuster = new CropDuster();
        CropRow tomatoCropRow = new CropRow(false, false);

        //Overload this method when time comes
        tomatoCropRow.add(tomatoPlant1, tomatoPlant2, tomatoPlant3);
        froilanda.mount(cropDuster);
        froilanda.fly(cropDuster);
        froilanda.fertilize(tomatoPlant);

        Boolean hasBeenFertilized = tomatoCropRow.getHasBeenFertilized();

        Assert.assertTrue(hasBeenFertilized);
    }

    @Test
    public void getHasBeenFertilizedTest2() {
        Pilot froilanda = new Pilot("froilanda");
        Crop cornStalk1 = new Crop(true);
        Crop cornStalk2 = new Crop(true);
        Crop cornStalk3 = new Crop(true);
        CropDuster cropDuster = new CropDuster();
        CropRow cornCropRow = new CropRow(false, false);

        //Overload this method when time comes
        cornCropRow.add(cornStalk1, cornStalk2, cornStalk3);

        cropDuster.isBeingRidden = true;
        froilanda.fertilize(tomatoPlant);

        Boolean hasBeenFertilized = cornCropRow.getHasBeenFertilized();

        Assert.assertTrue(hasBeenFertilized);
    }

    @Test
    public void getHasBeenFertilizedTest3() {
        Pilot froilanda = new Pilot("froilanda");
        Crop potatoRoot1 = new Crop(true);
        Crop potatoRoot2 = new Crop(true);
        Crop potatoRoot3 = new Crop(true);
        CropDuster cropDuster = new CropDuster();
        CropRow potatoCropRow = new CropRow(false, false);

        //Overload this method when time comes
        potatoCropRow.add(potatoRoot1, potatoRoot2, potatoRoot3);
        froilanda.mount(cropDuster);
        froilanda.fly(cropDuster);

        Boolean hasBeenFertilized = potatoCropRow.getHasBeenFertilized();

        Assert.assertFalse(hasBeenFertilized);
    }

    @Test
    public void getHasBeenHarvestedTest1() {
        Farmer froilan = new Farmer("froilan");
        CropRow tomoatoCropRow = newCropRow(true, false);
        Tractor froilansTractor = new Tractor();

        froilan.mount(froilansTractor);
        froilan.ride(froilansTractor);
        froilan.harvest(tomoatoCropRow);

        Boolean hasBeenHarvested = tomoatoCropRow.getHasBeenHarvested();

        Assert.assertTrue(hasBeenHarvested);
    }

    @Test
    public void getHasBeenHarvestedTest2() {
        Farmer froilan = new Farmer("froilan");
        CropRow cornCropRow = newCropRow(true, false);
        Tractor froilansTractor = new Tractor();

        froilan.mount(froilansTractor);
        froilan.ride(froilansTractor);

        Boolean hasBeenHarvested = froilan.harvest(cornCropRow);

        Assert.assertTrue(hasBeenHarvested);
    }

    @Test
    public void getHasBeenHarvested3() {
        Farmer froilan = new Farmer("froilan");
        CropRow potatoCropRow = new CropRow(true, false);
        Tractor trac = new Tractor();

        froilan.mount(trac);
        froilan.ride(trac);

        Boolean hasBeenHarvested = potatoCropRow.getHasBeenHarvested();

        Assert.assertFalse(hasBeenHarvested);
    }

}
