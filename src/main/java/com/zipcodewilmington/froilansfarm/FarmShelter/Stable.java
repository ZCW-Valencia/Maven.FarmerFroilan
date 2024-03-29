package com.zipcodewilmington.froilansfarm.FarmShelter;
import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;

public class Stable <T extends Horse>{
    private ArrayList<T> list = new ArrayList<>();

    public void add(T Horse) {
        list.add(Horse);
    }

    public boolean remove(T Horse){
        return list.remove(Horse);
    }

    public T get(int index){
        return list.get(index);
    }

    public int size(){
        return list.size();
    }

    public boolean contains(T Horse){
        return list.contains(Horse);
    }
}
