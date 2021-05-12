package com.crucosoft.mixed.java;

import com.crucosoft.mixed.java.nine.Animal;
import com.crucosoft.mixed.java.nine.Bird;
import com.crucosoft.mixed.java.nine.Parrot;

public class NinthTask {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        Bird bird = new Bird();
        Animal animal = new Animal();

        parrot.beTamed();
        parrot.layEgg();
        parrot.makeNoise();
        parrot.move();
        parrot.eat();

        System.out.println();

        bird.layEgg();
        bird.makeNoise();
        bird.move();
        bird.eat();

        System.out.println();

        animal.makeNoise();
        animal.move();
        animal.eat();
    }
}
