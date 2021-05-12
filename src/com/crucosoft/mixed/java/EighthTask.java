package com.crucosoft.mixed.java;

import com.crucosoft.mixed.java.eight.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EighthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = Integer.parseInt(scanner.nextLine().trim());


        ArrayList<Person> people = new ArrayList<>();

        for(int i = 0; i<number; i++) {
            System.out.print("Enter " + (i + 1) + ". person name: ");
            String name = scanner.nextLine().trim();
            System.out.print("Enter " + (i + 1) + ". person age: ");
            int age = Integer.parseInt(scanner.nextLine().trim());

            people.add(new Person(name, age));
        }
        Collections.sort(people);

        for (Person person:
             people) {
            System.out.println(person.getName() + ": " + person.getAge());
        }
    }
}
