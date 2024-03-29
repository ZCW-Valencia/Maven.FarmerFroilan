package com.zipcodewilmington.froilansfarm.FarmShelterTests;
import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.FarmShelter.FarmHouse;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarmHouseTest {
    private FarmHouse<Person> farmHouse;
    @Before
    public void setUp() {
        farmHouse = new FarmHouse<>();
    }

    @Test
    public void testAddPerson() { //Add Person FarmHouse Test
        Farmer farmer = new Farmer("Froilan");

        farmHouse.add(farmer); //Adding new person to FarmHouse

        Assert.assertEquals(1, farmHouse.size()); // Farmhouse should have 1 farmer after addition
        Assert.assertTrue(farmHouse.contains(farmer)); // FarmHouse should contain farmer after addition
    }

    @Test
    public void testRemovePerson() { //Remove Person FarmHouse Test
        Pilot pilot = new Pilot("Froilanda");

        farmHouse.add(pilot);
        farmHouse.remove(pilot); //Removing person from FarmHouse

        Assert.assertFalse(farmHouse.contains(pilot)); //FarmHouse should not contain pilot after removal
    }

    @Test
    public void testGetPerson() { //Get Person FarmHouse Test
        Farmer farmer = new Farmer("Froilan");
        Pilot pilot = new Pilot("Froilanda");

        farmHouse.add(farmer);
        farmHouse.add(pilot);

        Assert.assertEquals(farmer, farmHouse.get(0)); //Should retrieve/get farmer by index 0
        Assert.assertEquals(pilot, farmHouse.get(1)); //Should retrieve/get pilot by index 1
    }

    @Test
    public void testFarmHouseSize() { //FarmHouse Size Test
        Farmer farmer = new Farmer("Froilan");
        Pilot pilot = new Pilot("Froilanda");

        farmHouse.add(farmer);
        farmHouse.add(pilot);

        Assert.assertEquals(2, farmHouse.size()); //Farmhouse should have 2 people after addition
    }

    @Test
    public void testFarmHouseContains() { //FarmHouse Contains Test
        Farmer farmer = new Farmer("Froilan");

        farmHouse.add(farmer);

        Assert.assertTrue(farmHouse.contains(farmer)); //Farmhouse should contain frarmer
    }
}
