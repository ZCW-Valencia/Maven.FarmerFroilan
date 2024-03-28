package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Rider<T extends Rideable<T>> {

    public boolean mount(T ride);

    public boolean ride(T ride);

    public boolean dismount(T ride);
}
