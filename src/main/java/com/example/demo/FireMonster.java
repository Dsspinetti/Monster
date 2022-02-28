package com.example.demo;

public class FireMonster extends Monster {

    public FireMonster(String name) {
        super(name);
    }

    public String attack() {
        return getName() + " attack with fire";
    }
}
