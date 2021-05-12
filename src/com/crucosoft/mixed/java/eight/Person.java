package com.crucosoft.mixed.java.eight;

public class Person implements Comparable{
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Person(String name, Integer age){
        this.name   = name;
        this.age    = age;
    }

    @Override
    public int compareTo(Object o) {
        return this.age - ((Person)o).age;
    }
}
