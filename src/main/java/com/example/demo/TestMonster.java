package com.example.demo;

public class TestMonster {
    public static void main(String[] args) {

        IMonster[] monsters = {
                new FireMonster("r2u2"),
                new WaterMonster("u2r2"),
                new StoneMonster("r2r2"),
                new StoneMonster("a2b2"),
                new CookieMonster("Cookie")
        };

        MonsterHandler monsterHandler = new MonsterHandler();
        monsterHandler.handleMonsters(monsters);

    }
}
