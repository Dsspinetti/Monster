package com.example.demo;

public class StoneMonster extends Monster {

    public StoneMonster(String name) {
        super(name);
    }

    public String attack() {
        return getName() + " attack with stone";
    }
}
