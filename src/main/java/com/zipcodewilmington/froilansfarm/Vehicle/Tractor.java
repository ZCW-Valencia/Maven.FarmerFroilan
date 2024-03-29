package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.CropRow;

public class Tractor<T> extends FarmVehicle{
    private boolean isMounted;
    private boolean isBeingRidden;
    private boolean isDismounted;

    //constructor
    public Tractor(boolean isMounted,boolean isBeingRidden,boolean isDismounted){
        this.isMounted = isMounted;
        this.isBeingRidden = isBeingRidden;
        this.isDismounted = isDismounted;
    }

    //need getters and setters
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
        isBeingRidden = false;
    }


    public boolean harvest(CropRow cropRow){
        if(this.isBeingRidden == true){
            cropRow.setHasBeenHarvested(true);
            return true;
        }
        return false;
    }

    @Override
    public String makeNoise(){
        return "Tractor noiseeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";
    }


}
