package com.example.demo;

public class StoneMonster implements IMonster {

    public String getName() {
        return name;
    }

    private String name;

    public StoneMonster(String name) {

        this.name = name;
    }

    public String attack() {
        return getName() + " attack with stone";
    }
}
