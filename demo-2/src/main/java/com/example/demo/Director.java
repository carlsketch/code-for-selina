package com.example.demo;

public class Director {
    protected String name; //adding acce modif priv encapsulates
    // protected - allows everything in that package to access that variable aswell as its subclasses
    private int age; //encapsulation means only keeping the relevant properties about the class in the class



    public Director(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return age; //
    }
    public String getName(){
        return name;
    }
}
