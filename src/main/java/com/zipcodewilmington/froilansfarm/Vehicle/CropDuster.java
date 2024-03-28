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

    public boolean isMounted() {
        return isMounted;
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }

    public boolean isBeingRidden() {
        return isBeingRidden;
    }

    public void setBeingRidden(boolean beingRidden) {
        isBeingRidden = beingRidden;
    }

    public boolean isDismounted() {
        return isDismounted;
    }

    public void setDismounted(boolean dismounted) {
        isDismounted = dismounted;
    }

    public boolean fertillize(T cropRow, boolean hasBeenPlanted){
        if(this.isBeingRidden == true && hasBeenPlanted == true){
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




}
