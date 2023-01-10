package com.Satria.Pemrograman2.Challenge;

public class Weapon {
    public String name;
    public float damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public Weapon(String name, float damage) {
        this.name = name;
        this.damage = damage;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("damage: " + damage );
    }
}

