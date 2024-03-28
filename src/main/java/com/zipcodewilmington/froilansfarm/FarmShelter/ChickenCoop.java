package com.zipcodewilmington.froilansfarm.FarmShelter;

import java.util.ArrayList;

public class ChickenCoop <T extends Chicken> {
    public ArrayList<T> list = new ArrayList<>();

    public void add(T chicken) {
        list.add(chicken);
    }
}
