package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Food.Plate;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Produce;

public class Pilot extends Person implements Rider {
    private Boolean isFlying = false;
    private Boolean hasEaten;

    public Pilot(String name) {
        super(name);
    }

    public Boolean getFlying() {
        return isFlying;
    }


    @Override
    public void eat(Plate plate, int amount) {
        hasEaten = true;
    }
    @Override
    public String makeNoise() {
        return "Hey! I am a Pilot";
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

