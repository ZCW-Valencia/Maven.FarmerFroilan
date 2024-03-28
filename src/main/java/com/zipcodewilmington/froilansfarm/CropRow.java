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

    public void addCrop(T crop1, T crop2, T crop3) {
        this.add(crop1);
        this.add(crop2);
        this.add(crop3);
    }

    public void addCrop(T crop1, T crop2, T crop3, T crop4, T crop5) {
        this.add(crop1);
        this.add(crop2);
        this.add(crop3);
        this.add(crop4);
        this.add(crop5);
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
