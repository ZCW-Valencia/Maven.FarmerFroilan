package com.zipcodewilmington.froilansfarm.RidingHorseTest;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.FarmShelter.Farm;
import com.zipcodewilmington.froilansfarm.FarmShelter.Stable;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class RidingHorseTest {
    @Test
    public void ridingHorses(){
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

        Farmer froilan = new Farmer("Froilan");
        Pilot froilanda = new Pilot("Froilanda");

        froilan.mount(horse1);
        froilan.ride(horse1);
        horse1.exercise();
        //froilan.dismount(horse1);

        froilanda.mount(horse2);
        froilanda.ride(horse2);
        horse2.exercise();
        //froilanda.dismount(horse2);

        froilan.mount(horse3);
        froilan.ride(horse3);
        horse1.exercise();
        //froilan.dismount(horse3);

        froilanda.mount(horse4);
        froilanda.ride(horse4);
        horse2.exercise();
        //froilanda.dismount(horse4);

        froilan.mount(horse5);
        froilan.ride(horse5);
        horse1.exercise();
        //froilan.dismount(horse5);

        froilanda.mount(horse6);
        froilanda.ride(horse6);
        horse2.exercise();
        //froilanda.dismount(horse6);

        froilan.mount(horse7);
        froilan.ride(horse7);
        horse1.exercise();
        //froilan.dismount(horse7);

        froilanda.mount(horse8);
        froilanda.ride(horse8);
        horse2.exercise();
        //froilanda.dismount(horse8);

        froilan.mount(horse9);
        froilan.ride(horse9);
        horse1.exercise();
        //froilan.dismount(horse9);

        froilanda.mount(horse10);
        froilanda.ride(horse10);
        horse2.exercise();
        //froilanda.dismount(horse10);

        Assert.assertTrue(horse1.exercise());
        Assert.assertTrue(horse2.exercise());
        Assert.assertTrue(horse3.exercise());
        Assert.assertTrue(horse4.exercise());
        Assert.assertTrue(horse5.exercise());
        Assert.assertTrue(horse6.exercise());
        Assert.assertTrue(horse7.exercise());
        Assert.assertTrue(horse8.exercise());
        Assert.assertTrue(horse9.exercise());
        Assert.assertTrue(horse10.exercise());
    }

}
