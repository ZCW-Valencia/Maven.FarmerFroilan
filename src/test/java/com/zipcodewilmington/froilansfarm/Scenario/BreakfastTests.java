package com.zipcodewilmington.froilansfarm.Scenario;
import com.zipcodewilmington.froilansfarm.*;
import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Food.Plate;
import com.zipcodewilmington.froilansfarm.Interfaces.isEdible;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class BreakfastTests {

    private int froilanCornCropYield;
    private int froilanTomatoCropYield;
    private int froilanEggYield;
    private int froilandaCornCropYield;
    private int froilandaTomatoCropYield;
    private int froilandaEggYield;

    private Farmer froilan = new Farmer("froilan");
    private Pilot froilanda = new Pilot("froilanda");

    CropDuster cropDuster = new CropDuster(false, false, false);
    Tractor tractor = new Tractor(false, false, false);
    private Plate froilansPlate = new Plate();
    private Plate froilandasPlate = new Plate();

    @Before
    public void setUp() {
        Crop cornStalk = new Crop(false);
        Crop cornStalk2 = new Crop(false);
        Crop tomatoPlant1 = new Crop(false);
        Crop tomatoPlant2 = new Crop(false);
        froilan.plant(cornStalk);
        froilan.plant(cornStalk2);
        froilan.plant(tomatoPlant1);
        froilan.plant(tomatoPlant2);

        CropRow<Crop> cornCropRow = new CropRow<>(false, false);
        CropRow<Crop> tomatoCropRow = new CropRow<>(false, false);
        CropRow<Crop> cornCropRow2 = new CropRow<>(false, false);
        CropRow<Crop> tomatoCropRow2 = new CropRow<>(false, false);
        cornCropRow.add(cornStalk);
        tomatoCropRow.add(tomatoPlant1);
        tomatoCropRow.add(tomatoPlant2);
        cornCropRow2.add(cornStalk);
        cornCropRow2.add(cornStalk2);
        tomatoCropRow2.add(tomatoPlant1);

        froilanda.mount(cropDuster);
        froilanda.ride(cropDuster);
        cropDuster.fertilize(cornCropRow);
        cropDuster.fertilize(tomatoCropRow);
        cropDuster.fertilize(cornCropRow2);
        cropDuster.fertilize(tomatoCropRow2);
        froilan.mount(tractor);
        froilan.ride(tractor);
        tractor.harvest(cornCropRow);
        tractor.harvest(tomatoCropRow);
        tractor.harvest(cornCropRow2);
        tractor.harvest(tomatoCropRow2);

        froilanCornCropYield = cornCropRow.yield();
        froilanTomatoCropYield = tomatoCropRow.yield();
        froilandaCornCropYield = cornCropRow2.yield();
        froilandaTomatoCropYield = tomatoCropRow2.yield();

        Chicken chicken = new Chicken();
        for (int i = 0; i < 5; i++) {
            froilanEggYield += chicken.yield();
        }

        for (int i = 0; i < 2; i++) {
            froilandaEggYield += chicken.yield();
        }

        // Froilan's plate
        for (int i = 0; i < froilanCornCropYield; i++) {
            froilansPlate.add(new Corn());
        }
        for (int i = 0; i < froilanTomatoCropYield; i++) {
            froilansPlate.add(new Tomato());
        }
        for (int i = 0; i < froilanEggYield; i++) {
            froilansPlate.add(new Egg());
        }

        // Froilanda's plate
        for (int i = 0; i < froilandaCornCropYield; i++) {
            froilandasPlate.add(new Corn());
        }
        for (int i = 0; i < froilandaTomatoCropYield; i++) {
            froilandasPlate.add(new Tomato());
        }
        for (int i = 0; i < froilandaEggYield; i++) {
            froilandasPlate.add(new Egg());
        }
    }

    @Test
    public void createPlateTest1() {
        boolean plateContainsCorn = false;

        for (Object item: froilansPlate) {
            if (item instanceof Corn);
            plateContainsCorn = true;
            break;
        }

        Assert.assertTrue(plateContainsCorn);
    }

    @Test
    public void createPlateTest2() {
        int foodIsEdible = 0;

        for (Object item: froilansPlate) {
            if (item instanceof isEdible);
            foodIsEdible++;
        }
        int expected = 8;

        Assert.assertEquals(expected, foodIsEdible);
    }
    @Test
    public void createPlateTest3() {
        boolean plateContainsEgg = false;

        for (Object item: froilansPlate) {
            if (item instanceof Egg);
            plateContainsEgg = true;
            break;
        }

        Assert.assertTrue(plateContainsEgg);
    }

    @Test
    public void froilanEatTest1() {
        froilan.eat(froilansPlate, 1);
        Assert.assertTrue(froilan.getHasEaten());
    }

    @Test
    public void froilanEatTest2() {
        froilan.eat(froilansPlate, 0);
        Assert.assertFalse(froilan.getHasEaten());
    }

    @Test
    public void froilandaEatTest1() {
        froilan.eat(froilandasPlate, 1);
        Assert.assertTrue(froilan.getHasEaten());
    }

    @Test
    public void froilandaEatTest2() {
        froilan.eat(froilandasPlate, 0);
        Assert.assertFalse(froilan.getHasEaten());
    }



}
