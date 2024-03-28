package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class CropRow <T extends Crop> extends ArrayList<T> {
    Boolean hasBeenFertilized;
    Boolean hasBeenHarvested;


    public CropRow(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        super();
    }

    public CropRow() {

    }

    public void addCrop(T crop1, T crop2, T crop3) {
        this.add(crop1);
        this.add(crop2);
        this.add(crop3);
    }

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public CropRow getHarvestedCrops() {
        CropRow result = null;
        if (this.hasBeenHarvested == true) {
            result = this;
        }
        return this;
    }

    public CropRow<T> yield() {
        return getHarvestedCrops();
    }
}
