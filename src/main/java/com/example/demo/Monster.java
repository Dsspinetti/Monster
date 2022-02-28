package com.example.demo;

public class Monster {

    public String getName() {
        return name;
    }

    private String name;

    public Monster(String name) {
        this.name = name;
    }

    public Monster() {
    }

    public String attack() {
        return "default attack";
    }
}
