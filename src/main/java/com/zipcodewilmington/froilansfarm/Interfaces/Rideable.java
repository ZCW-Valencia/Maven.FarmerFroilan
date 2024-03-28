package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Rideable<T> {

    public boolean getIsMounted();

    public boolean getIsBeingRidden();

    public boolean getIsDismounted();

    public void setIsMounted(T ride);

    public void setIsBeingRidden(T ride);

    public void setIsDismounted(T ride);

}
