package com.example.demo;

public class WaterMonster implements IMonster {

    @Override
    public String getName() {

        return name;
    }

    private String name;

    public WaterMonster(String name) {

        this.name = name;
    }

    public String attack() {
        return getName() + " attack with water";
    }
}
