package com.crucosoft.mixed.java.nine;

public class Animal {
    public void makeNoise(){
        System.out.println(this.getClass().getSimpleName() + " made a noise");
    }
    public void move(){
        System.out.println(this.getClass().getSimpleName() + " moved");
    }
    public void eat(){
        System.out.println(this.getClass().getSimpleName() + " ate");
    }
}
