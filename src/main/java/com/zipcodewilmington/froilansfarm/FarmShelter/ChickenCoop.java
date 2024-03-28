package com.zipcodewilmington.froilansfarm.FarmShelter;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;

public class ChickenCoop <T extends Chicken> {
    private ArrayList<T> list = new ArrayList<>();

    public void add(T chicken) {
        list.add(chicken);
    }

    public boolean remove(T chicken){
        return list.remove(chicken);
    }

    public T get(int index){
        return list.get(index);
    }

    public int size(){
        return list.size();
    }

    public boolean contains(T chicken){
        return list.contains(chicken);
    }
}
