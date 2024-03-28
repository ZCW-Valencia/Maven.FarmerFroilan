package com.zipcodewilmington.froilansfarm.Persons;

//import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

public class Farmer extends Person implements Rider, Botanist {

    public Farmer(String name) {
        super(name);
    }

    @Override
    public void eat(Produce food, int amount) {
    }
    @Override
    public boolean hasEaten() {
        return true;
    }

    @Override
    public boolean plant(Crop crop) {
        return true;
    }

    @Override
    public String makeNoise() {
        return null;
    }
    @Override
    public boolean mount(Rideable ride) {
        ride.setIsMounted(ride);
        return ride.getIsMounted();
    }

    @Override
    public boolean ride(Rideable ride) {
        ride.setIsBeingRidden(ride);
        return ride.getIsBeingRidden();
    }

    @Override
    public boolean dismount(Rideable ride) {
        ride.setIsDismounted(ride);
        return ride.getIsDismounted();
    }
}
