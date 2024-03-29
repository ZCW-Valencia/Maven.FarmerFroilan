package com.zipcodewilmington.froilansfarm.PersonTest;

import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Food.Plate;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.Tomato;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void inheritancePerson(){
        Person farmer =(Person)(Object) new Farmer("Farmer1");
        Assert.assertTrue(farmer instanceof Person);
    }

    @Test
    public void TestFarmerInterface(){
        Person farmer =(Person)(Object) new Farmer("Farmer1");
        Assert.assertTrue(farmer instanceof NoiseMaker);
    }

    @Test
    public void TestFarmerInterfaceEater(){
        Person farmer =(Person)(Object) new Farmer("Farmer1");
        Assert.assertTrue(farmer instanceof Eater);
    }

    @Test
    public void TestPlant(){
        Crop crop = new Crop();
        Farmer farmer = new Farmer("Farmer1");
        Assert.assertTrue(farmer.plant(crop));

    }

    @Test
    public void TestMount(){
        Farmer farmer = new Farmer("Farmer1");
        Tractor tractor = new Tractor(false, false, false);
        Assert.assertTrue(farmer.mount(tractor));
    }

    @Test
    public void TestRide(){
        Farmer farmer = new Farmer("Farmer1");
        Tractor tractor = new Tractor(false, false, false);
        Assert.assertTrue(farmer.ride(tractor));
        Assert.assertTrue(tractor.getIsBeingRidden());
    }

    @Test
    public void TestDismount(){
        Farmer farmer = new Farmer("Farmer1");
        Tractor tractor = new Tractor(false, false, false);
        Assert.assertTrue(farmer.dismount(tractor));
        Assert.assertTrue(tractor.getIsDismounted());
    }

    @Test
    public void MakeNoise(){
        String speak = "Hi! I am a Farmer";
        Farmer farmer = new Farmer("person");
        Assert.assertEquals(speak,farmer.makeNoise());

    }

    @Test
    public void TestEatFood(){
        Farmer farmer = new Farmer("person");
        Plate plateTomato = new Plate();
        int amount = 5;
        farmer.eat(plateTomato,amount);
        Assert.assertTrue(farmer.getHasEaten());
    }

}
