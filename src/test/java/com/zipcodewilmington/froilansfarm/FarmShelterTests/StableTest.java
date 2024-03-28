package com.zipcodewilmington.froilansfarm.FarmShelterTests;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.FarmShelter.Stable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StableTest {
    private Stable<Horse> Stable;

    @Before
    public void setUp() {
        Stable = new Stable();
    }

    @Test
    public void testAddHorse() { //Add Horse Stable Test
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();

        Stable.add(horse1); //Adding new horse to Stable
        Stable.add(horse2);

        Assert.assertEquals(1, Stable.size()); //Stable should have 1 horse after addition
    }

    @Test
    public void testRemoveHorse() { //Remove Horse Stable Test
        Horse horse = new Horse();

        Stable.add(horse);
        Stable.remove(horse); //Removing horse from Stable

        Assert.assertTrue(Stable.remove(horse)); // Removed horse from ChickenCoop
        Assert.assertFalse(Stable.contains(horse)); // Stable should not contain horse after removal
    }


    @Test
    public void testGetHorse() { //Get Horse Stable Test
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        Horse horse4 = new Horse();


        Stable.add(horse1);
        Stable.add(horse2);
        Stable.add(horse3);
        Stable.add(horse4);

        Assert.assertEquals(horse1, Stable.get(0)); //Should retrieve/get horse1 by index 0
        Assert.assertEquals(horse4, Stable.get(3)); //Should retrieve/get horse4 by index 3
    }

    @Test
    public void testStableSize() { //Stable Size Test
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();

        Stable.add(horse1);
        Stable.add(horse2);
        Stable.add(horse3);

        Assert.assertEquals(3, Stable.size()); //Stable size should have 3 horses after addition
    }

    @Test
    public void testStableContains() {  //Stable Contains Test
        Horse horse = new Horse();

        Stable.add(horse);

        Assert.assertTrue(Stable.contains(horse)); //Stable should contain horse
    }
}


