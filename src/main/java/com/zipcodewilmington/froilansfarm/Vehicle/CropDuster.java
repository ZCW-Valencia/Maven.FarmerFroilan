package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.AirCraft;

public class CropDuster <T> extends FarmVehicle implements AirCraft {
    private boolean isMounted;
    private boolean isBeingRidden;
    private boolean isDismounted;

    //constructor
    public CropDuster(boolean isMounted, boolean isBeingRidden, boolean isDismounted){
        this.isMounted = isMounted;
        this.isBeingRidden = isBeingRidden;
        this.isDismounted = isDismounted;
    }


    public boolean fertilize(T cropRow){
        if(this.isBeingRidden == true){
            return true;
        }
        return false;
    }
    @Override
    public boolean flying(){
        if(this.isBeingRidden == true){
            return true;
        }
        return false;
    }
    @Override
    public String makeNoise(){
        return "CropDuster noiseeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";
    }

    @Override
    public boolean getIsMounted() {
        return isMounted;
    }

    @Override
    public boolean getIsBeingRidden() {
        return isBeingRidden;
    }

    @Override
    public boolean getIsDismounted() {
        return isDismounted;
    }

    @Override
    public void setIsMounted(Object ride) {
        isMounted = true;
        isDismounted = false;
    }

    @Override
    public void setIsBeingRidden(Object ride) {
        isBeingRidden = true;
    }

    @Override
    public void setIsDismounted(Object ride) {
        isDismounted = true;
        isMounted = false;
    }
}
