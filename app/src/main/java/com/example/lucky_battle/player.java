package com.example.lucky_battle;

import java.util.Random;

public class player {

    private int hp=30;

    public int attack() {
        Random r = new Random();
        int atk = (r.nextInt(5)+1)*(r.nextInt(5)+1)*(r.nextInt(5)+1);
        if(atk <= 30)
            return 5;
        else if(atk <= 180)
            return 3;
        else
            return 1;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
