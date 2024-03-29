package com.zipcodewilmington.froilansfarm.UsingVehicleTests;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class FlyingCropDusterTest {
    @Test
    public void flyingCropDuster(){

        Pilot pilot = new Pilot("Froilanda");
        CropDuster cropDuster = new CropDuster(false, false, false);
        CropRow cropRow = new CropRow(false, false);

        pilot.mount(cropDuster);
        pilot.ride(cropDuster);
        cropDuster.fertilize(cropRow);

        Assert.assertTrue(cropRow.getHasBeenFertilized());
    }
}
