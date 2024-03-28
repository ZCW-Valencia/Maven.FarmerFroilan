package com.zipcodewilmington.froilansfarm.Interfaces;

//import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Produce;

public interface Eater {

    public void eat(Produce food, int amount);
    public boolean hasEaten();


}
