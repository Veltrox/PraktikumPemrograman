package com.Satria.Pemrograman2.Pertemuan6.Tugas;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] arg) {

        int angka;

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Masukkan Angka atau Bilangan yang diinginkan: ");

            try {

                angka = Integer.parseInt(input.next());
                System.out.println("Angka yang anda masukkan adalah: " + angka);

                break;
            }

            catch (java.lang.NumberFormatException e) {
                System.out.println("Masukkan bilangan dan bukan huruf!!!");

            }
        }
    }
}


