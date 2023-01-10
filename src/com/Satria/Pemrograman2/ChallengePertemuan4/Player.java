package com.Satria.Pemrograman2.ChallengePertemuan4;

public class Player {
    String name;
    float hp;

    public Player() {
    }

    public Player(String name, float hp) {
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

    public void showHud(Weapon weapon) {

        if (hp > 0) {
            System.out.println("Nama: " + name);
            System.out.println("HP: " + hp);
            System.out.println("Damage Attack : " + weapon.getDamage());
        } else {
            System.out.println("Nama: " + name + " telah mati");
        }

    }

    public void attack(Weapon weapon, Potion potion){
        System.out.println("Player " + name + " menyerang dengan senjata " + weapon.name + " + Potion :  " + potion.getHeal());
    }
}
