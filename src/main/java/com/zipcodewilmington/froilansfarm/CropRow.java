package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class CropRow <T extends Crop> extends ArrayList<T> implements Produce {
    Boolean hasBeenFertilized;
    Boolean hasBeenHarvested;


    public CropRow(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        super();
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
}
