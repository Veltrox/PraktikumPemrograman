package com.Satria.Pemrograman2.Pertemuan2;

public class Looping {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Looping... ( " + i + " )");
        }
        System.out.println("Looping For selesai \n");

        //While
        int j = 1;
        while (j <= 100) {
            System.out.println("Looping... ( " + j + " )");
            j += 10;
        }
        System.out.println("Looping while selesai : \n");

        // Do While
        int k = 10;
        do {
            System.out.println("Looping... (" + k + ")");
            k--;
        } while (k > 0);
        System.out.println("Looping Do While selesai");
    }
}

