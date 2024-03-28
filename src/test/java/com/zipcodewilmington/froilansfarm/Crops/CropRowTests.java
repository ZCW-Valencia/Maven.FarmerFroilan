package com.zipcodewilmington.froilansfarm.Crops;
import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Test;
import org.junit.Assert;

public class CropRowTests {

    @Test
    public void getHasBeenFertilizedTest1() {
        Pilot froilanda = new Pilot("froilanda");
        Crop tomatoPlant1 = new Crop(true);
        Crop tomatoPlant2 = new Crop(true);
        Crop tomatoPlant3 = new Crop(true);
        CropDuster cropDuster = new CropDuster(false, false, false);
        CropRow<Crop> tomatoCropRow = new CropRow<>(false, false);

        //Overload this method when time comes
        tomatoCropRow.addCrop(tomatoPlant1, tomatoPlant2, tomatoPlant3);
        froilanda.mount(cropDuster);
        froilanda.fly(cropDuster);
        cropDuster.fertilize(tomatoCropRow);

        Boolean hasBeenFertilized = tomatoCropRow.getHasBeenFertilized();

        Assert.assertTrue(hasBeenFertilized);
    }

    @Test
    public void getHasBeenFertilizedTest2() {
        Pilot froilanda = new Pilot("froilanda");
        Crop cornStalk1 = new Crop(true);
        Crop cornStalk2 = new Crop(true);
        Crop cornStalk3 = new Crop(true);
        CropDuster cropDuster = new CropDuster(false, false, false);
        CropRow<Crop> cornCropRow = new CropRow<>(false, false);

        //Overload this method when time comes
        cornCropRow.addCrop(cornStalk1, cornStalk2, cornStalk3);

        cropDuster.fertilize(cornCropRow);

        Boolean hasBeenFertilized = cornCropRow.getHasBeenFertilized();

        Assert.assertTrue(hasBeenFertilized);
    }

    @Test
    public void getHasBeenFertilizedTest3() {
        Pilot froilanda = new Pilot("froilanda");
        Crop potatoRoot1 = new Crop(true);
        Crop potatoRoot2 = new Crop(true);
        Crop potatoRoot3 = new Crop(true);
        CropDuster cropDuster = new CropDuster(false, false, false);
        CropRow<Crop> potatoCropRow = new CropRow<>(false, false);

        //Overload this method when time comes
        potatoCropRow.addCrop(potatoRoot1, potatoRoot2, potatoRoot3);
        froilanda.mount(cropDuster);
        froilanda.fly(cropDuster);

        Boolean hasBeenFertilized = potatoCropRow.getHasBeenFertilized();

        Assert.assertFalse(hasBeenFertilized);
    }

    @Test
    public void getHasBeenHarvestedTest1() {
        Farmer froilan = new Farmer("froilan");
        CropRow<Crop> tomoatoCropRow = new CropRow<>(true, false);
        Tractor froilansTractor = new Tractor(false, false, false);

        froilan.mount(froilansTractor);
        froilan.ride(froilansTractor);
        froilansTractor.harvest(tomoatoCropRow);

        Boolean hasBeenHarvested = tomoatoCropRow.getHasBeenHarvested();

        Assert.assertTrue(hasBeenHarvested);
    }

    @Test
    public void getHasBeenHarvestedTest2() {
        Farmer froilan = new Farmer("froilan");
        CropRow<Crop> cornCropRow = new CropRow<>(true, false);
        Tractor froilansTractor = new Tractor(false, false, false);

        froilan.mount(froilansTractor);
        froilan.ride(froilansTractor);

        Boolean hasBeenHarvested = froilansTractor.harvest(cornCropRow);

        Assert.assertTrue(hasBeenHarvested);
    }

    @Test
    public void getHasBeenHarvested3() {
        Farmer froilan = new Farmer("froilan");
        CropRow<Crop> potatoCropRow = new CropRow<>(true, false);
        Tractor trac = new Tractor(false, false, false);

        froilan.mount(trac);
        froilan.ride(trac);

        Boolean hasBeenHarvested = potatoCropRow.getHasBeenHarvested();

        Assert.assertFalse(hasBeenHarvested);
    }
}
