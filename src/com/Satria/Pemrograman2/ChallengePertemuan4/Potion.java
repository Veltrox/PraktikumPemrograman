package com.Satria.Pemrograman2.ChallengePertemuan4;

public class Potion extends Item{
    float heal;

    public Potion() {
    }


    public Potion(float heal) {
        this.heal = heal;
    }

    public Potion(String name, int price, float heal) {
        super(name, price);
        this.heal = heal;
    }

    public float getHeal() {
        return heal;
    }

    public void setHeal(float heal) {
        this.heal = heal;
    }

    public void extraInfo() {
    }

}
