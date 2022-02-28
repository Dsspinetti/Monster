package com.example.demo;

public class FireMonster implements IMonster {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public FireMonster(String name) {
        this.name = name;
    }

    public String attack() {
        return getName() + " attack with fire";
    }
}
