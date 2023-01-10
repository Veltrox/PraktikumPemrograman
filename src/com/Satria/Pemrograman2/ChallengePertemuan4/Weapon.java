package com.Satria.Pemrograman2.ChallengePertemuan4;

public class Weapon extends Item {
    float damage;

    public Weapon() {
    }

    public Weapon(String name, int price) {
        super(name, price);
    }

    public Weapon(float damage) {
        this.damage = damage;
    }

    public Weapon(String name, int price, float damage) {
        super(name, price);
        this.damage = damage;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public void extraInfo() {
        }
}
