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

public class WednesdayTest {
    @Test
    public void WednesdayTest(){

        Farmer froilan = new Farmer("froilan");
        Crop cornCrop = new Crop(false);
        Crop tomatoCrop = new Crop(false);
        CropRow<Crop> cropRow4 = new CropRow<>(false, false);
        CropRow<Crop> cropRow5 = new CropRow<>(false, false);
        froilan.plant(cornCrop);
        froilan.plant(tomatoCrop);
        cropRow4.add(cornCrop);
        cropRow5.add(tomatoCrop);

        Assert.assertTrue(cornCrop.getHasBeenPlanted());
        Assert.assertTrue(tomatoCrop.getHasBeenPlanted());
    }
}
