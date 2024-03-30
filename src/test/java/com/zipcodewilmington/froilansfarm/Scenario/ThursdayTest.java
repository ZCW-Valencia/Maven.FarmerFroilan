package com.zipcodewilmington.froilansfarm.Scenario;

import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class ThursdayTest {
    @Test
    public void ThursdayTest(){
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

        Assert.assertTrue(row4.getHasBeenFertilized());
        Assert.assertTrue(row5.getHasBeenFertilized());
    }
}
