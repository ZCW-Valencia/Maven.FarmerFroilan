package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.isEdible;

public class Tomato extends CropRow<Crop> implements isEdible {
    @Override
    public boolean isEdible() {
        return true;
    }

}
