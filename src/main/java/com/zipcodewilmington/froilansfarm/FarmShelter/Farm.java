package com.zipcodewilmington.froilansfarm.FarmShelter;
import com.zipcodewilmington.froilansfarm.Persons.Person;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private FarmHouse<Person> farmHouse;
    private List<Stable> stables;
    private List<ChickenCoop> chickenCoops;

    public Farm() {
        this.farmHouse = new FarmHouse<>();
        this.stables = new ArrayList<>();
        this.chickenCoops = new ArrayList<>();
    }

    public FarmHouse<Person> getFarmHouse() {
        return farmHouse;
    }

    public void addStable(Stable stable) {
        stables.add(stable);
    }

    public boolean removeStable(Stable stable) {
        return stables.remove(stable);
    }

    public List<Stable> getStable() {
        return stables;
    }

    public void addChickenCoop(ChickenCoop chicken) {
        chickenCoops.add(chicken);
    }

    public boolean removeChickenCoop(ChickenCoop chicken) {
        return chickenCoops.remove(chicken);
    }

    public List<ChickenCoop> getChickenCoop() {
        return chickenCoops;
    }
}

