package com.example.demo;

public class MonsterHandler {

    public void handleMonsters(IMonster[] monsters) {
        for(IMonster monster: monsters) {
            System.out.println(monster.attack());
        }
    }
}
