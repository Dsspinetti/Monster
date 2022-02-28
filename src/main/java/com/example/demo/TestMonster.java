package com.example.demo;

public class TestMonster {
    public static void main(String[] args) {

        Monster[] monsters = {
                new FireMonster("r2u2"),
                new WaterMonster("u2r2"),
                new StoneMonster("r2r2"),
                new StoneMonster("a2b2"),
                new CookieMonster("Cookie")
        };

        MonsterHandler monsterHandler = new MonsterHandler();
        monsterHandler.handleMonsters(monsters);

        Monster m4 = new Monster("u2u2");
        System.out.println(m4.attack());
    }
}
