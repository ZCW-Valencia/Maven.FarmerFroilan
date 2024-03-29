package com.zipcodewilmington.froilansfarm.UsingVehicleTests;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class OperatingTractorTest {
    @Test
    public void operatingTractor() {

        Farmer farmer = new Farmer("Froilan");
        Tractor tractor = new Tractor(false, false, false);
        CropRow cropRow = new CropRow(false, false);

        farmer.mount(tractor);
        farmer.ride(tractor);
        //farmer.dismount(tractor);
        tractor.harvest(cropRow);

        Assert.assertTrue(cropRow.getHasBeenHarvested());
    }
}




