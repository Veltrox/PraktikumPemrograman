package com.Satria.Pemrograman2.Tugas;

public class Car {
    public String name;
    public String special;
    public float health;
    public float protection;

    public Car(String name, String special, float health, float protection) {
        this.name = name;
        this.special = special;
        this.health = health;
        this.protection = protection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public float getProtection() {
        return protection;
    }

    public void setProtection(float protection) {
        this.protection = protection;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Special: " + special );
        System.out.println("Health: " + health);
        System.out.println("Protection: " + protection);
    }
}
