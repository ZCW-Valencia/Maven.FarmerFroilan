package com.zipcodewilmington.froilansfarm.Persons;
import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

public class Farmer extends Person implements Rider, Botanist {
    private boolean hasEaten;

    public Farmer(String name) {
        super(name);
    }

    @Override
    public void eat(Produce food, int amount) {
        hasEaten = true;
    }

    public boolean getHasEaten() {
        return hasEaten;
    }

    @Override
    public boolean plant(Crop crop) {
        crop.setHasBeenPlanted(true);
        return true;
    }

    @Override
    public String makeNoise() {
        return "Hi! I am a Farmer";
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
