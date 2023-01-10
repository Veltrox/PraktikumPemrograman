package com.Satria.Pemrograman2.Challenge;

public class Main {
    public static void main(String[] args) {

        //Pembuatan object dari class Animal
        Hero cat = new Hero("Pissy", 10000);
        Armor dog = new Armor("Nana", 200);
        Weapon rabbit = new Weapon("Duty", 300000000);

        cat.showInfo();
        dog.showInfo();
        rabbit.showInfo();



    }
}
