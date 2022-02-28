package com.example.demo;

public abstract class Monster {

    public String getName() {
        return name;
    }

    private String name;

    public Monster(String name) {
        this.name = name;
    }

    public Monster() {
    }

    public abstract String attack();
}
