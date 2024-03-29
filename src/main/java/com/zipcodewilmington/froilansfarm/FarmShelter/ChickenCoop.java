package com.zipcodewilmington.froilansfarm.FarmShelter;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;

public class ChickenCoop <T extends Chicken> {
    private ArrayList<T> list = new ArrayList<>();

    public void addChicken(T chicken) {
        list.add(chicken);
    }

    public boolean removeChicken(T chicken){
        return list.remove(chicken);
    }

    public T getChicken(int index){
        return list.get(index);
    }

    public int sizeChicken(){
        return list.size();
    }

    public boolean containsChicken(T chicken){
        return list.contains(chicken);
    }
}
