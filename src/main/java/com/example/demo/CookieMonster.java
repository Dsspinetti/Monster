package com.example.demo;

public class CookieMonster extends Monster {

    public CookieMonster(String name) {
        super(name);
    }

    public String attack() {
        return getName() + " attack with cookies";
    }
}
