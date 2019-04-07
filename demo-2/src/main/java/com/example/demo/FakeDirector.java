package com.example.demo;

public class FakeDirector extends Director {

    private String fakeName;

    public FakeDirector(String name, int age, String fakeName) {
        super(name, age);
        this.fakeName = fakeName;
    }

    public String getName() {
        return super.name + "FAKE STUFF";
    }
}
