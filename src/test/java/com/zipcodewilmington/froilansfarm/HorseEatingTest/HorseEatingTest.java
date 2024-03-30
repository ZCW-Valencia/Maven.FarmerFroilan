package com.zipcodewilmington.froilansfarm.HorseEatingTest;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Corn;
import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.FarmShelter.Farm;
import com.zipcodewilmington.froilansfarm.FarmShelter.Stable;
import com.zipcodewilmington.froilansfarm.Food.Plate;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HorseEatingTest {

    private int horseCornYield;
    private Plate horsePlate = new Plate();

    @Before
    public void setUp() {
        Farmer froilan = new Farmer("froilan");
        Pilot froilanda = new Pilot("froilanda");
        CropDuster cropDuster = new CropDuster(false, false, false);
        Tractor tractor = new Tractor(false, false, false);
        Crop cornStalk = new Crop(false);
        CropRow<Crop> cornCropRow = new CropRow<>(false, false);
        froilan.plant(cornStalk);
        cornCropRow.add(cornStalk);
        froilanda.mount(cropDuster);
        froilanda.ride(cropDuster);
        cropDuster.fertilize(cornCropRow);
        froilan.mount(tractor);
        froilan.ride(tractor);
        tractor.harvest(cornCropRow);

        horseCornYield = cornCropRow.yield();

        for (int i = 0; i < horseCornYield; i++) {
            horsePlate.add(new Corn());
        }



    }

    @Test
    public void createPlateTest1() {
        boolean plateContainsCorn = false;

        for (Object item: horsePlate) {
            if (item instanceof Corn)
            plateContainsCorn = true;
            break;
        }

        Assert.assertTrue(plateContainsCorn);
    }


    @Test
    public void horseEating(){
        Farm farm = new Farm();

        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();

        farm.addStable(stable1);
        farm.addStable(stable2);
        farm.addStable(stable3);

        Horse horse1 = new Horse(false, false, true);
        Horse horse2 = new Horse(false, false, true);
        Horse horse3 = new Horse(false, false, true);
        Horse horse4 = new Horse(false, false, true);
        Horse horse5 = new Horse(false, false, true);
        Horse horse6 = new Horse(false, false, true);
        Horse horse7 = new Horse(false, false, true);
        Horse horse8 = new Horse(false, false, true);
        Horse horse9 = new Horse(false, false, true);
        Horse horse10 = new Horse(false, false, true);

        stable1.addHorse(horse1);
        stable1.addHorse(horse2);
        stable1.addHorse(horse3);
        stable1.addHorse(horse4);
        stable2.addHorse(horse5);
        stable2.addHorse(horse6);
        stable2.addHorse(horse7);
        stable3.addHorse(horse8);
        stable3.addHorse(horse9);
        stable3.addHorse(horse10);

        horse1.eat(horsePlate, 1);
        horse2.eat(horsePlate, 1);
        horse3.eat(horsePlate, 1);
        horse4.eat(horsePlate, 1);
        horse5.eat(horsePlate, 1);
        horse6.eat(horsePlate, 1);
        horse7.eat(horsePlate, 1);
        horse8.eat(horsePlate, 1);
        horse9.eat(horsePlate, 1);
        horse10.eat(horsePlate, 1);
        Assert.assertTrue(horse1.getHasEaten());
        Assert.assertTrue(horse2.getHasEaten());
        Assert.assertTrue(horse3.getHasEaten());
        Assert.assertTrue(horse4.getHasEaten());
        Assert.assertTrue(horse5.getHasEaten());
        Assert.assertTrue(horse6.getHasEaten());
        Assert.assertTrue(horse7.getHasEaten());
        Assert.assertTrue(horse8.getHasEaten());
        Assert.assertTrue(horse9.getHasEaten());
        Assert.assertTrue(horse10.getHasEaten());


        //do thing

    }
}
