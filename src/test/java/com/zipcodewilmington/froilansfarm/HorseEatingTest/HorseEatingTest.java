package com.zipcodewilmington.froilansfarm.HorseEatingTest;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.FarmShelter.Farm;
import com.zipcodewilmington.froilansfarm.FarmShelter.Stable;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import org.junit.Test;

public class HorseEatingTest {

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

        Crop cornStalk = new Crop(false);

        //do thing

    }
}
