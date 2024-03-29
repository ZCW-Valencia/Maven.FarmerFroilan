package com.zipcodewilmington.froilansfarm.Crops;
import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import org.junit.Test;
import org.junit.Assert;

public class CropTests {

    @Test
    public void getHasBeenPlantedTest1() {
        Farmer froilan = new Farmer("froilan");
        Crop tomatoPlant = new Crop(false);

        Boolean hasBeenPlanted = froilan.plant(tomatoPlant);

        Assert.assertTrue(hasBeenPlanted);
    }

    @Test
    public void getHasBeenPlantedTest2() {
        Farmer froilan = new Farmer("froilan");
        Crop cornStalk = new Crop(false);
        froilan.plant(cornStalk);

        Boolean hasBeenPlanted = cornStalk.getHasBeenPlanted();

        Assert.assertTrue(hasBeenPlanted);
    }

    @Test
    public void getHasBeenPlantedTest3() {
        Crop potatoRoot = new Crop(false);

        Boolean hasBeenPlanted = potatoRoot.getHasBeenPlanted();

        Assert.assertFalse(hasBeenPlanted);
    }

    // should probably be in CropRow;
    @Test
    public void getHasBeenFertilizedTest() {
        Pilot froilanda = new Pilot("froilanda");
        Crop tomatoPlant = new Crop(true);
        CropDuster cropDuster = new CropDuster(false, false, false);

        froilanda.mount(cropDuster);
        froilanda.ride(cropDuster);

        Boolean hasBeenFertilized = tomatoPlant.getHasBeenFertilized();

        Assert.assertFalse(hasBeenFertilized);
    }

    @Test
    public void getHasBeenFertilizedTest2() {
        Pilot froilanda = new Pilot("froilanda");
        Crop cornStalk = new Crop(true);
        CropDuster cropDuster = new CropDuster(false, false, false);

        froilanda.mount(cropDuster);
        froilanda.ride(cropDuster);


        Boolean hasBeenFertilized = cornStalk.getHasBeenFertilized();

        Assert.assertFalse(hasBeenFertilized);
    }

    @Test
    public void getHasBeenFertilizedTest3() {
        Pilot froilanda = new Pilot("froilanda");
        Crop potatoRoot = new Crop(true);
        CropDuster cropDuster = new CropDuster(false, false, false);

        froilanda.mount(cropDuster);
        froilanda.ride(cropDuster);

        Boolean hasBeenFertilized = potatoRoot.getHasBeenFertilized();

        Assert.assertFalse(hasBeenFertilized);
    }

    @Test
    public void cropInstanceOfProduceTest() {
        Crop crop = new Crop();
        Assert.assertTrue(crop instanceof Produce);
    }

    @Test
    public void tomatoPlantInstanceOfProduceTest() {
        Crop tomatoPlant = new Crop();
        Assert.assertTrue(tomatoPlant instanceof Produce);
    }

    @Test
    public void cornStalkInstanceOfProduceTest() {
        Crop cornStalk = new Crop();
        Assert.assertTrue(cornStalk instanceof Produce);
    }

    @Test
    public void potatoRootInstanceOfProduceTest() {
        Crop potatoRoot = new Crop();
        Assert.assertTrue(potatoRoot instanceof Produce);
    }

}