package com.zipcodewilmington.froilansfarm.PersonTest;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void PersonsName(){
        Person person = new PersonTest("Froilan");
        Assert.assertEquals("Froilan",person.getName());
    }

    @Test
    public void MakeNoise(){
        String speak = "Talk";
        Person person = new Person("person");
        Assert.assertEquals(speak,person.speak());

    }

    @Test
    public void TestEatFood(){
        Person person = new Person("person");
        Corn corn = new Corn();
        int amount = 5;
        person.eat(corn,amount);
        Assert.assertTrue(person.hasEaten());
    }



}
