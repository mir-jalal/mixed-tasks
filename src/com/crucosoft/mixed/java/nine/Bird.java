package com.crucosoft.mixed.java.nine;

public class Bird extends Animal{
    @Override
    public void makeNoise()
    {
        System.out.println(this.getClass().getSimpleName() + " tweeted");
    }

    @Override
    public void move(){
        System.out.println(this.getClass().getSimpleName() + " flew");
    }

    public void layEgg(){
        System.out.println(this.getClass().getSimpleName() + " laid eggs");
    }
}
