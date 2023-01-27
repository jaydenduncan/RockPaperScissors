package com.example.rockpaperscissors;

public class Player {

    private int score;
    private Weapon weapon;

    public Player(){
        this.score = 0;
        this.weapon = null;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int s){
        this.score = s;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    public void setWeapon(Weapon w){
        this.weapon = w;
    }
}
