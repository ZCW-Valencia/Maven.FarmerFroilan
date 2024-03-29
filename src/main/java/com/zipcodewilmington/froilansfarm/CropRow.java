package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class CropRow <T extends Crop> extends ArrayList<T> implements Produce {
    Boolean hasBeenFertilized;
    Boolean hasBeenHarvested;


    public CropRow(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        super();
        this.hasBeenFertilized = hasBeenFertilized;
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public CropRow() {

    }

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }


    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public void setHasBeenHarvested(Boolean hasBeenHarvested) {
        this.hasBeenHarvested = true;
    }

    @Override
    public int yield() {
        return this.size();
    }
}
