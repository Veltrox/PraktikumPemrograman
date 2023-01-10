package com.Satria.Pemrograman2.Challenge;

public class Hero {
    String name;
    float hp;

    public Hero(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("hp: " + hp );
    }
}

