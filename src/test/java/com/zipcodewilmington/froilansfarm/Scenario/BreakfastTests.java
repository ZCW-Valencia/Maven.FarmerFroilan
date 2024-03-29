package com.zipcodewilmington.froilansfarm.Scenario;
import com.zipcodewilmington.froilansfarm.*;
import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Food.Plate;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class BreakfastTests {

    private int cornCropYield;
    int tomatoCropYield;
    int eggYield;
    @Before
    public void setUp() {
        Farmer froilan = new Farmer("froilan");
        Pilot froilanda = new Pilot("froilanda");
        CropDuster cropDuster = new CropDuster(false, false, false);
        Tractor tractor = new Tractor(false, false, false);

        Crop cornStalk = new Crop(true);
        Crop tomatoPlant1 = new Crop(true);
        Crop tomatoPlant2 = new Crop(true);
        froilan.plant(cornStalk);
        froilan.plant(tomatoPlant1);
        froilan.plant(tomatoPlant2);

        CropRow<Crop> cornCropRow = new CropRow<>(false, false);
        CropRow<Crop> tomatoCropRow = new CropRow<>(false, false);
        cornCropRow.add(cornStalk);
        tomatoCropRow.add(tomatoPlant1);
        tomatoCropRow.add(tomatoPlant2);

        froilanda.mount(cropDuster);
        froilanda.ride(cropDuster);
        cropDuster.fertilize(cornCropRow);
        cropDuster.fertilize(tomatoCropRow);
        froilan.mount(tractor);
        froilan.ride(tractor);
        tractor.harvest(cornCropRow);
        tractor.harvest(tomatoCropRow);

        cornCropYield = cornCropRow.yield();
        tomatoCropYield = tomatoCropRow.yield();

        eggYield = 0;
        Chicken chicken = new Chicken();
        for (int i = 0; i <=5; i++) {
            eggYield += chicken.yield();
        }
    }


    @Test
    public void createPlateTest1() {
        boolean plateContainsCorn = false;

        Plate froilansPlate = new Plate();
        for (int i = 0; i < cornCropYield; i++) {
            froilansPlate.add(new Corn());
        }
        for (int i = 0; i < tomatoCropYield; i++) {
            froilansPlate.add(new Tomato());
        }
        for (int i = 0; i < eggYield; i++) {
            froilansPlate.add(new Egg());
        }

        for (Object item: froilansPlate) {
            if (item instanceof Corn);
            plateContainsCorn = true;
            break;
        }

        Assert.assertTrue(plateContainsCorn);
    }

    @Test
    public void createPlateTest2() {
        int plateContainsTomato = 0;

        Plate froilansPlate = new Plate();
        for (int i = 0; i < cornCropYield; i++) {
            froilansPlate.add(new Corn());
        }
        for (int i = 0; i < tomatoCropYield; i++) {
            froilansPlate.add(new Tomato());
        }
        for (int i = 0; i < eggYield; i++) {
            froilansPlate.add(new Egg());
        }

        for (Object item: froilansPlate) {
            if (item instanceof Tomato);
            plateContainsTomato++;
        }
        int expected = 5;

        Assert.assertEquals(expected, plateContainsTomato);
    }
    @Test
    public void createPlateTest3() {
        boolean plateContainsEgg = false;

        Plate froilansPlate = new Plate();
        for (int i = 0; i < cornCropYield; i++) {
            froilansPlate.add(new Corn());
        }
        for (int i = 0; i < tomatoCropYield; i++) {
            froilansPlate.add(new Tomato());
        }
        for (int i = 0; i < eggYield; i++) {
            froilansPlate.add(new Egg());
        }

        for (Object item: froilansPlate) {
            if (item instanceof Egg);
            plateContainsEgg = true;
            break;
        }

        Assert.assertTrue(plateContainsEgg);
    }

}
