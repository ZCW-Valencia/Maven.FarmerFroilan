package com.zipcodewilmington.froilansfarm.Vehicle;

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

    //if isBeingRidden and hasBeenFertilized is both true, return true else false
    public boolean harvest(T cropRow, boolean hasBeenFertilized){
        if(this.isBeingRidden == true && hasBeenFertilized == true){
            return true;
        }
        return false;
    }

    @Override
    public String makeNoise(){
        return "Tractor noiseeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";
    }


}
