package com.zipcodewilmington.froilansfarm.Scenario;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class TuesdayTest {
    @Test
    public void tuesday() {

        Farmer farmer = new Farmer("Froilan");
        Tractor tractor = new Tractor(false, false, false);
        CropRow cropRow = new CropRow(true, false);

        farmer.mount(tractor);
        farmer.ride(tractor);
        tractor.harvest(cropRow);

        Assert.assertTrue(cropRow.getHasBeenHarvested());
    }
}
