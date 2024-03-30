package com.zipcodewilmington.froilansfarm.Vehicle;

import org.junit.Test;

public class VehicleTest extends Vehicle {
    @Override
    public String makeNoise() {
        return "Testing testing";
    }

    @Override
    public boolean getIsMounted() {
        return false;

    }

    @Override
    public boolean getIsBeingRidden() {
        return false;
    }

    @Override
    public boolean getIsDismounted() {
        return false;
    }

    @Test
    public void testMakeNoise(){
        VehicleTest vehicleTest = new VehicleTest();    //isMounted, isBeingRidden, isDismounted
        String expected = vehicleTest.makeNoise();

        org.junit.Assert.assertEquals(expected, vehicleTest.makeNoise());
    }

    @Test
    public void testGetIsMounted(){
        VehicleTest vehicleTest = new VehicleTest();    //isMounted, isBeingRidden, isDismounted

        org.junit.Assert.assertFalse(vehicleTest.getIsMounted());
    }

    @Test
    public void testGetIsBeingRidden(){
        VehicleTest vehicleTest = new VehicleTest();    //isMounted, isBeingRidden, isDismounted

        org.junit.Assert.assertFalse(vehicleTest.getIsBeingRidden());
    }

    @Test
    public void testGetIsDismounted(){
        VehicleTest vehicleTest = new VehicleTest();    //isMounted, isBeingRidden, isDismounted

        org.junit.Assert.assertFalse(vehicleTest.getIsDismounted());
    }
}
