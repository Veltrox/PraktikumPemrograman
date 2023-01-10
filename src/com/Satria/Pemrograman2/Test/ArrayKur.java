package com.Satria.Pemrograman2.Test;

public class ArrayKur {
    public static void main(String[] args) {

        String[] names = new String[5];

        System.out.println("Panjang Array: " + names.length);

        names[0] = "Satria";
        names[1] = "Rizky";
        names[2] = "Cahya";
        names[3] = "Putra";
        names[4] = "Ardiansyah";

        System.out.println("Nilai Array");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i) + ": " + names[i]);
        }
    }
}
