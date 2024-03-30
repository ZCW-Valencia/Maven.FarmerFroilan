package com.zipcodewilmington.froilansfarm.Scenario;

import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FridayTest {

    Farmer froilan = new Farmer("froilan");
    CropRow<Crop> cropRow4 = new CropRow<>(false, false);
    CropRow<Crop> cropRow5 = new CropRow<>(false, false);

    @Before
    public void setUp() {
        //Farmer froilan = new Farmer("froilan");
        Crop cornCrop = new Crop(false);
        Crop tomatoCrop = new Crop(false);
//        CropRow<Crop> cropRow4 = new CropRow<>(false, false);
//        CropRow<Crop> cropRow5 = new CropRow<>(false, false);
        froilan.plant(cornCrop);
        froilan.plant(tomatoCrop);
        cropRow4.add(cornCrop);
        cropRow5.add(tomatoCrop);

        Pilot froilanda = new Pilot("Froilanda");
        CropDuster plane = new CropDuster(false, false, true);
        CropRow<Crop> row1 = new CropRow<>(false, false);
        CropRow<Crop> row2 = new CropRow<>(false, false);
        CropRow<Crop> row3 = new CropRow<>(false, false);
        CropRow<Crop> row4 = new CropRow<>(false, false);
        CropRow<Crop> row5 = new CropRow<>(false, false);

        froilanda.mount(plane);
        froilanda.ride(plane);

        plane.fertilize(row4);
        plane.fertilize(row5);
        froilanda.dismount(plane);
    }
    @Test
    public void FridayTest(){
        Tractor tractor = new Tractor(false, false, false);
        froilan.mount(tractor);
        froilan.ride(tractor);
        tractor.harvest(cropRow4);
        tractor.harvest(cropRow5);

        Assert.assertTrue(cropRow4.getHasBeenHarvested());
        Assert.assertTrue(cropRow5.getHasBeenHarvested());
    }
}
