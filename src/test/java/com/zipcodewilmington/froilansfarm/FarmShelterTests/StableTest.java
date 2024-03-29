package com.zipcodewilmington.froilansfarm.FarmShelterTests;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.FarmShelter.Stable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StableTest {
    private Stable<Horse> stable;
    @Before
    public void setUp() {
        stable = new Stable<>();
    }

    @Test
    public void testAddHorse() { //Add Horse Stable Test
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();

        stable.addHorse(horse1); //Adding new horse to Stable
        stable.addHorse(horse2);

        Assert.assertEquals(1, stable.sizeHorse()); //Stable should have 1 horse after addition
    }

    @Test
    public void testRemoveHorse() { //Remove Horse Stable Test
        Horse horse = new Horse();

        stable.addHorse(horse);
        stable.removeHorse(horse); //Removing horse from Stable

        Assert.assertTrue(stable.removeHorse(horse)); // Removed horse from ChickenCoop
        Assert.assertFalse(stable.containsHorse(horse)); // Stable should not contain horse after removal
    }


    @Test
    public void testGetHorse() { //Get Horse Stable Test
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        Horse horse4 = new Horse();


        stable.addHorse(horse1);
        stable.addHorse(horse2);
        stable.addHorse(horse3);
        stable.addHorse(horse4);

        Assert.assertEquals(horse1, stable.getHorse(0)); //Should retrieve/get horse1 by index 0
        Assert.assertEquals(horse4, stable.getHorse(3)); //Should retrieve/get horse4 by index 3
    }

    @Test
    public void testStableSize() { //Stable Size Test
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();

        stable.addHorse(horse1);
        stable.addHorse(horse2);
        stable.addHorse(horse3);

        Assert.assertEquals(3, stable.sizeHorse()); //Stable size should have 3 horses after addition
    }

    @Test
    public void testStableContains() {  //Stable Contains Test
        Horse horse = new Horse();

        stable.addHorse(horse);

        Assert.assertTrue(stable.containsHorse(horse)); //Stable should contain horse
    }
}


