package com.example.demo;

public class CookieMonster implements IMonster {

    private String name;

    public CookieMonster(String name) {
        this.name = name;
    }

    public String attack() {
        return getName() + " attack with cookies";
    }
    @Override
    public String getName() {
        return name;
    }
}
