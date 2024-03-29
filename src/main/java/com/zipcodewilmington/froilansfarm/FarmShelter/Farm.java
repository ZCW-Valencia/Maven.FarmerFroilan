package com.zipcodewilmington.froilansfarm.FarmShelter;

import com.zipcodewilmington.froilansfarm.Persons.Person;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private FarmHouse<Person> farmHouse = new FarmHouse<>();
    private List<Stable> stables = new ArrayList<>();
    private List<ChickenCoop> chickenCoops = new ArrayList<>();

    public Farm(){
    }

    public void add(Stable stable){
        stables.add(stable);
    }

    public void remove(Stable stable){
        stables.remove(stable);
    }

    public Stable get(int index){
        return stables.get(index);
    }

    public int size(){
        return stables.size();
    }





}
