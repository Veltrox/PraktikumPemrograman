package com.Satria.Pemrograman2.Challenge;

public class Armor {
    public String name;
    public float protection;

    public Armor(String name, float protection) {
        this.name = name;
        this.protection = protection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getProtection() {
        return protection;
    }

    public void setProtection(float protection) {
        this.protection = protection;

        }
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Protection: " + protection );
    }
}
