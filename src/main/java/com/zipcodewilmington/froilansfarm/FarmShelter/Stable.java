package com.zipcodewilmington.froilansfarm.FarmShelter;
import java.util.ArrayList;

public class Stable <T extends Horse>{
    public ArrayList<T> list = new ArrayList<>();

    public void add(T horse) {
        list.add(horse);
    }
}
