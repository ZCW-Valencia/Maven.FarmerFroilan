package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class CropRow <T extends Crop> extends ArrayList<T> implements Produce {
    Boolean hasBeenFertilized = false;
    Boolean hasBeenHarvested = false;


    public CropRow(boolean hasBeenFertilized, boolean hasBeenHarvested) {
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

    public Integer getHarvestedCrops() {
        Integer result = null;
        if (this.hasBeenHarvested == true) {
            result = this.size();
        }
        return result;
    }

    @Override
    public int yield() {
        return getHarvestedCrops();
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public void setHasBeenHarvested(Boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }
}
