package com.zipcodewilmington.froilansfarm.FarmShelter;
import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Persons.Person;

import java.util.ArrayList;

public class FarmHouse <T extends Person> {
    private ArrayList<T> list = new ArrayList<>();

    public void add(T person) {
        list.add(person);
    }

    public boolean remove(T person) {
        return list.remove(person);
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

    public boolean contains(T person) {
        return list.contains(person);
    }
}

