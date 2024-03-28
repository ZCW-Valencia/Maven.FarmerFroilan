package com.zipcodewilmington.froilansfarm.FarmShelter;
import java.util.ArrayList;

public class FarmHouse <T extends Person> {
    public ArrayList<T> list = new ArrayList<>();

    public void add(T person) {
        list.add(person);
    }
}