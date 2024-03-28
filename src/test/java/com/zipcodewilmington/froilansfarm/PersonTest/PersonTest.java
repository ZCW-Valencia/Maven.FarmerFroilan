package com.zipcodewilmington.froilansfarm.PersonTest;

import com.zipcodewilmington.froilansfarm.Persons.Person;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void PersonsName(){
        Person person = new PersonTest("person");
        Assert.assertEquals("Froilan",person.getName());
    }





}
