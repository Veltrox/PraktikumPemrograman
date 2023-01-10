package com.Satria.Pemrograman2.ChallengePertemuan4;

public class Main {
    public static void main(String[] args) {

        System.out.println("==== Player 1 ====");
        Player player1 = new Player();
        player1.setName("Satria");
        player1.setHp(100);
        System.out.println();

        System.out.println("==== Player 1  | Item Detail ====");
        Item item = new Item();
        item.setName("Potion");
        item.setPrice(100);
        item.showInfo();
        System.out.println();

        System.out.println("==== Player 1  | Potion ====");
        Potion potion = new Potion();
        potion.setName("Potion");
        potion.setHeal(10);

        System.out.println("Name : " + potion.getName());
        System.out.println("Healing : " + potion.getHeal());
        System.out.println();

        System.out.println("==== Player 1  | Weapon ====");
        Weapon weapon1 = new Weapon();
        weapon1.setName("Katana");
        weapon1.setDamage(100);

        System.out.println("Name Weapon : " + weapon1.getName());
        System.out.println("Damage : " + weapon1.getDamage());
        System.out.println();

        System.out.println("==== Player 1  | Show HUD ====");
        player1.showHud(weapon1);
        System.out.println();

        System.out.println("==== Player 1  | Attack ====");
        player1.attack(weapon1, potion);

        System.out.println();

        System.out.println("==== Player 2 ====");
        Player player2 = new Player();
        player2.setName("Yuda");
        player2.setHp(100);
        System.out.println();

        System.out.println("==== Player 2  | Item Info ====");
        Item item2 = new Item();
        item2.setName("Healing");
        item2.setPrice(200);
        item2.showInfo();
        System.out.println();

        System.out.println("==== Player 2  | Potion ====");
        Potion potion2 = new Potion();
        potion2.setName("Healing");
        potion2.setHeal(100);

        System.out.println("Name : " + potion2.getName());
        System.out.println("Healing : " + potion2.getHeal());

        System.out.println();

        System.out.println("==== Player 2  | Weapon ====");
        Weapon weapon2 = new Weapon();
        weapon2.setName("Bow");
        weapon2.setDamage(10);

        System.out.println("Name Weapon : " + weapon2.getName());
        System.out.println("Damage : " + weapon2.getDamage());
        System.out.println();

        System.out.println("==== Player 2 | Show HUD ====");
        float old_hp_player2 = player2.getHp();

        player2.setHp(old_hp_player2 - weapon1.getDamage());
        player2.showHud(weapon2);
        System.out.println();

    }
}
