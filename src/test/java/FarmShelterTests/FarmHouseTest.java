package FarmShelterTests;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class FarmHouseTest {
    private FarmHouse farmHouse;
    @Before
    public void setUp(){
         farmHouse = new FarmHouse();
    }

    @Test
    public void testAddPerson(){ //Add Person FarmHouse Test
        Person person1 = new Person("Froilan");

        farmHouse.addPerson(person1); //Adding new person to FarmHouse

        Assert.assertEquals(1, farmHouse.size()); // Farmhouse should have 1 person after addition
        Assert.assertTrue(farmHouse.contains(person1)); // FarmHouse should contain Froilan after addition
    }

    @Test
    public void testRemovePerson(){ //Remove Person FarmHouse Test
        Person person2 = new Person("Froilanda");

        farmHouse.addPerson(person2);
        farmHouse.removePerson(person2); //Removing Froilanda from FarmHouse

        Assert.assertFalse(farmHouse.contains(person2)); //FarmHouse should not contain Froilanda after removal
    }

    @Test
    public void testGetPerson(){ //Get Person FarmHouse Test
        Person person1 = new Person("Froilan");
        Person person2 = new Person("Froilanda");

        farmHouse.addPerson(person1);
        farmHouse.addPerson(person2);

        Assert.assertEquals(person1, farmHouse.get(0)); //Should retrieve/get Froilan by index 0
        Assert.assertEquals(person2, farmHouse.get(1)); //Should retrieve/get Froilanda by index 1
    }

    @Test
    public void testFarmHouseSize(){ //FarmHouse Size Test
        Person person1 = new Person("Froilan");
        Person person2 = new Person("Froilanda");

        farmHouse.addPerson(person1);
        farmHouse.addPerson(person2);

        Assert.assertEquals(2, farmHouse.size()); //Farmhouse should have 2 people after addition
    }

    @Test
    public void testFarmHouseContains(){ //FarmHouse Contains Test
        Person person1 = new Person("Froilan");
        Person person2 = new Person("Froilanda");

        farmHouse.addPerson(person1);
        farmHouse.addPerson(person2);

        Assert.assertTrue(farmHouse.contains(person1, person2)); //Farmhouse should contain Froilan and Froilanda
    }
}
