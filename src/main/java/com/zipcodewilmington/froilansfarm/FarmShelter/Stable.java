package com.zipcodewilmington.froilansfarm.FarmShelter;
import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;

public class Stable <T extends Horse>{
    private ArrayList<T> list = new ArrayList<>();

    public void addHorse(T Horse) {
        list.add(Horse);
    }

    public boolean removeHorse(T Horse){
        return list.remove(Horse);
    }

    public T getHorse(int index){
        return list.get(index);
    }

    public int sizeHorse(){
        return list.size();
    }

    public boolean containsHorse(T Horse){
        return list.contains(Horse);
    }
}
