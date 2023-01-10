package com.Satria.Pemrograman2.Tugas;

public class Main {
    public static void main(String[] args) {

        Car Mobil  = new Car("Porsche", "Rocket", 100000, 100000);
        Motorcycle Motor = new Motorcycle("Ducati", "Speed", 2000, 1000);
        Truck Truk = new Truck("Volvo", "Sheild", 3000000, 100000);

        Mobil.showInfo();
        Motor.showInfo();
        Truk.showInfo();

    }
}
