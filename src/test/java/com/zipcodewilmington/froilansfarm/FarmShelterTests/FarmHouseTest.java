package com.zipcodewilmington.froilansfarm.FarmShelterTests;
import com.zipcodewilmington.froilansfarm.FarmShelter.FarmHouse;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarmHouseTest {
    private FarmHouse<Person> FarmHouse;
    @Before
    public void setUp() {
        FarmHouse = new FarmHouse<>();
    }

    @Test
    public void testAddPerson() { //Add Person FarmHouse Test
        Person person = new Person();

        FarmHouse.add(person); //Adding new person to FarmHouse

        Assert.assertEquals(1, FarmHouse.size()); // Farmhouse should have 1 person after addition
        Assert.assertTrue(FarmHouse.contains(person)); // FarmHouse should contain person after addition
    }

    @Test
    public void testRemovePerson() { //Remove Person FarmHouse Test
        Person person = new Person();

        FarmHouse.add(person);
        FarmHouse.remove(person); //Removing person from FarmHouse

        Assert.assertFalse(FarmHouse.contains(person)); //FarmHouse should not contain person after removal
    }

    @Test
    public void testGetPerson() { //Get Person FarmHouse Test
        Person person1 = new Person();
        Person person2 = new Person();

        FarmHouse.add(person1);
        FarmHouse.add(person2);

        Assert.assertEquals(person1, FarmHouse.get(0)); //Should retrieve/get person1 by index 0
        Assert.assertEquals(person2, FarmHouse.get(1)); //Should retrieve/get person2 by index 1
    }

    @Test
    public void testFarmHouseSize() { //FarmHouse Size Test
        Person person1 = new Person();
        Person person2 = new Person();

        FarmHouse.add(person1);
        FarmHouse.add(person2);

        Assert.assertEquals(2, FarmHouse.size()); //Farmhouse should have 2 people after addition
    }

    @Test
    public void testFarmHouseContains() { //FarmHouse Contains Test
        Person person = new Person();

        FarmHouse.add(person);

        Assert.assertTrue(FarmHouse.contains(person)); //Farmhouse should contain person
    }
}
