package com.example.demo;

public class WaterMonster extends Monster {

    public WaterMonster(String name) {
        super(name);
    }

    public String attack() {
        return getName() + " attack with water";
    }
}
