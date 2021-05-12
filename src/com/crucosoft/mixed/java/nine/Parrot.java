package com.crucosoft.mixed.java.nine;

public class Parrot extends Bird {
    @Override
    public void makeNoise()
    {
        System.out.println(this.getClass().getSimpleName() + " imitated");
    }

    public void beTamed(){
        System.out.println(this.getClass().getSimpleName() + " tamed");
    }
}
