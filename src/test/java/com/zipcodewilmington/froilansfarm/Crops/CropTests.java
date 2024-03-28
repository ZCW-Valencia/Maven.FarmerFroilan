package com.zipcodewilmington.froilansfarm.Crops;
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

        Boolean hasBeenPlanted = cornStalk.getHasBeenPlanted;

        Assert.assertTrue(hasBeenPlanted);
    }

    @Test
    public void getHasBeenPlantedTest3() {
        Crop potatoRoot = new Crop(false);

        Boolean hasBeenPlanted = potatoRoot.getHasBeenPlanted;

        Assert.assertFalse(hasBeenPlanted);
    }

    // should probably be in CropRow;
    @Test
    public void getHasBeenFertilizedTest() {
        Pilot froilanda = new Pilot("froilanda");
        Crop tomatoPlant = new Crop(true);
        CropDuster cropDuster = new CropDuster();

        froilanda.mount(cropDuster);
        froilanda.fly(cropDuster);
        froilanda.fertilize(tomatoPlant);

        Boolean hasBeenFertilized = tomatoPlant.getHasBeenFertilized();

        Assert.assertTrue(hasBeenFertilized);
    }

    @Test
    public void getHasBeenFertilizedTest2() {
        Pilot froilanda = new Pilot("froilanda");
        Crop cornStalk = new Crop(true);
        CropDuster cropDuster = new CropDuster();

        froilanda.mount(cropDuster);
        froilanda.fly(cropDuster);


        Boolean hasBeenFertilized = froilanda.fertilize(cropDuster);

        Assert.assertTrue(hasBeenFertilized);
    }

    @Test
    public void getHasBeenFertilizedTest3() {
        Pilot froilanda = new Pilot("froilanda");
        Crop potatoRoot = new Crop(true);
        CropDuster cropDuster = new CropDuster();

        froilanda.mount(cropDuster);
        froilanda.fly(cropDuster);

        Boolean hasBeenFertilized = potatoRoot.getHasBeenFertilized();

        Assert.assertFalse(hasBeenFertilized);
    }

}
