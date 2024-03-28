package com.zipcodewilmington.froilansfarm.FarmShelterTests;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StableTest {
    private Stable stable;
    @Before
    public void setUp(){
        stable = new Stable();
    }

    @Test
    public void testAddHorse(){ //Add Horse Stable Test
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();

        stable.add(horse1); //Adding new horse to Stable
        stable.add(horse2);


        Assert.assertEquals(1, stable.size()); //Stable should have 1 horse after addition
    }

    @Test
    public void testRemoveHorse(){ //Remove Horse Stable Test
        Horse horse1 = new Horse();

        stable.add(horse1);
        stable.remove(horse1); //Removing horse from Stable

        Assert.assertFalse(stable.contains(horse)); //Stable should not contain horse after removal
    }

    @Test
    public void testGetHorse(){ //Get Horse Stable Test
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        Horse horse4 = new Horse();


        stable.add(horse1);
        stable.add(horse2);
        stable.add(horse3);
        stable.add(horse4);

        Assert.assertEquals(horse1, stable.get(0)); //Should retrieve/get horse1 by index 0
        Assert.assertEquals(horse4, stable.get(3)); //Should retrieve/get horse4 by index 3
    }

    @Test
    public void testStableSize(){ //Stable Size Test
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();

        stable.add(horse1);
        stable.add(horse2);
        stable.add(horse3);

        Assert.assertEquals(3, stable.size()); //Stable size should have 3 horses after addition
    }

    @Test
    public void testStableContains(){  //Stable Contains Test
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();

        stable.add(horse1);
        stable.add(horse2);

        Assert.assertTrue(stable.contains(horse1, horse2)); //Stable should contain horse1 and horse2
    }
}


