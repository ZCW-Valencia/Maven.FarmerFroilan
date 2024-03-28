package com.zipcodewilmington.froilansfarm;

public class Crop implements Produce {
    private boolean hasBeenPlanted;
    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;


    public Crop(boolean hasBeenPlanted) {
        this.hasBeenPlanted = hasBeenPlanted;
    }

    public Crop() {
    }

    public boolean getHasBeenPlanted() {
        return hasBeenPlanted;
    }

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    @Override
    public int yield(Object CropRow) {
        return 0;
    }
}