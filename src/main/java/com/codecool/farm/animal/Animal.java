package com.codecool.farm.animal;

public abstract class Animal {

    private int size = 0;

    public int getSize() {
        return size;
    }

    public void addSize(int gain){
        this.size += gain;
    }

    public abstract void feed();
}
