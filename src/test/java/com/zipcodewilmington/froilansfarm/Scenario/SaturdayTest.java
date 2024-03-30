package com.zipcodewilmington.froilansfarm.Scenario;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Corn;
import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.FarmShelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.FarmShelter.Farm;
import com.zipcodewilmington.froilansfarm.Food.Plate;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import com.zipcodewilmington.froilansfarm.Potato;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SaturdayTest {
    private int chickenPotatoYield;
    private Plate chickenPlate = new Plate();

    @Before
    public void setUp() {
        Farmer froilan = new Farmer("froilan");
        Pilot froilanda = new Pilot("froilanda");
        CropDuster cropDuster = new CropDuster(false, false, false);
        Tractor tractor = new Tractor(false, false, false);
        Crop potatoRoot = new Crop(false);
        CropRow<Crop> potatoCropRow = new CropRow<>(false, false);

        froilan.plant(potatoRoot);
        potatoCropRow.add(potatoRoot);
        froilanda.mount(cropDuster);
        froilanda.ride(cropDuster);
        cropDuster.fertilize(potatoCropRow);
        froilan.mount(tractor);
        froilan.ride(tractor);
        tractor.harvest(potatoCropRow);

        chickenPotatoYield = potatoCropRow.yield();

        for (int i = 0; i < chickenPotatoYield; i++) {
            chickenPlate.add(new Potato());
        }

    }

    @Test
    public void createPlateTest() {
        boolean plateContainsPotato = false;

        for (Object item: chickenPlate) {
            if (item instanceof Potato)
            plateContainsPotato = true;
            break;
        }

        Assert.assertTrue(plateContainsPotato);
    }

    @Test
    public void SaturdayTest(){
        Farm farm = new Farm();
        ChickenCoop chickenCoop1 = new ChickenCoop();
        ChickenCoop chickenCoop2 = new ChickenCoop();
        ChickenCoop chickenCoop3 = new ChickenCoop();
        ChickenCoop chickenCoop4 = new ChickenCoop();

        farm.addChickenCoop(chickenCoop1);
        farm.addChickenCoop(chickenCoop2);
        farm.addChickenCoop(chickenCoop3);
        farm.addChickenCoop(chickenCoop4);

        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        Chicken chicken4 = new Chicken();
        Chicken chicken5 = new Chicken();
        Chicken chicken6 = new Chicken();
        Chicken chicken7 = new Chicken();
        Chicken chicken8 = new Chicken();
        Chicken chicken9 = new Chicken();
        Chicken chicken10 = new Chicken();
        Chicken chicken11 = new Chicken();
        Chicken chicken12 = new Chicken();
        Chicken chicken13 = new Chicken();
        Chicken chicken14 = new Chicken();
        Chicken chickenLitte = new Chicken();

        chickenCoop1.addChicken(chicken1);
        chickenCoop1.addChicken(chicken2);
        chickenCoop1.addChicken(chicken3);
        chickenCoop1.addChicken(chicken4);
        chickenCoop1.addChicken(chicken5);

        chickenCoop2.addChicken(chicken6);
        chickenCoop2.addChicken(chicken7);
        chickenCoop2.addChicken(chicken8);
        chickenCoop2.addChicken(chicken9);

        chickenCoop3.addChicken(chicken10);
        chickenCoop3.addChicken(chicken11);
        chickenCoop3.addChicken(chicken12);
        chickenCoop3.addChicken(chicken13);
        chickenCoop3.addChicken(chicken14);

        chickenCoop4.addChicken(chickenLitte);

        chicken1.eat(chickenPlate, 1);
        chicken2.eat(chickenPlate, 1);
        chicken3.eat(chickenPlate, 1);
        chicken4.eat(chickenPlate, 1);
        chicken5.eat(chickenPlate, 1);
        chicken6.eat(chickenPlate, 1);
        chicken7.eat(chickenPlate, 1);
        chicken8.eat(chickenPlate, 1);
        chicken9.eat(chickenPlate, 1);
        chicken10.eat(chickenPlate, 1);
        chicken11.eat(chickenPlate, 1);
        chicken12.eat(chickenPlate, 1);
        chicken13.eat(chickenPlate, 1);
        chicken14.eat(chickenPlate, 1);
        chickenLitte.eat(chickenPlate, 1);

        Assert.assertTrue(chicken1.getHasEaten());
        Assert.assertTrue(chicken2.getHasEaten());
        Assert.assertTrue(chicken3.getHasEaten());
        Assert.assertTrue(chicken4.getHasEaten());
        Assert.assertTrue(chicken5.getHasEaten());
        Assert.assertTrue(chicken6.getHasEaten());
        Assert.assertTrue(chicken7.getHasEaten());
        Assert.assertTrue(chicken8.getHasEaten());
        Assert.assertTrue(chicken9.getHasEaten());
        Assert.assertTrue(chicken10.getHasEaten());
        Assert.assertTrue(chicken11.getHasEaten());
        Assert.assertTrue(chicken12.getHasEaten());
        Assert.assertTrue(chicken13.getHasEaten());
        Assert.assertTrue(chicken14.getHasEaten());
        Assert.assertTrue(chickenLitte.getHasEaten());


    }

}
