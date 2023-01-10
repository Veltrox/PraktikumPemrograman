package com.Satria.Pemrograman2.Pertemuan3;

public class Main {
    public static void main(String[] args) {
        //Pembuatan object dari class Animal
        Animal dog = new Animal("Nana", 2);
        Animal cat = new Animal( "Pissy", 2);
        Animal rabbit = new Animal("Duty", 3);

        //Uji coba pemanggil method
        dog.showInfo();
        cat.showInfo();
        rabbit.showInfo();

        System.out.println("Usia " + dog.getName() + " adalah " + dog.getAge() + " tahun ");

        dog.setAge(4);
        System.out.println("Usia " + dog.getName() + " adalah " + dog.getAge() + " tahun ");
    }
}
