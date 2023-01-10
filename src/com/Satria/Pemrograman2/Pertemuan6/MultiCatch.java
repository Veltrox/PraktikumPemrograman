package com.Satria.Pemrograman2.Pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Masukkan angka: ");
            int angka1 = input.nextInt();

            System.out.println("Masukkan pembagi: ");
            int angka2 = input.nextInt();

            int hasil = angka1 / angka2;
            System.out.println("Penghitungan: " + angka1 + " / " + angka2 + " = " + hasil);

        }
        catch (ArithmeticException e) {
            System.out.println("Terjadi error, tidak dapat diproses");
        }
        catch (InputMismatchException e) {
            System.out.println("Terjadi error, masukkan angka saja");
        }

        System.out.println("Penghitungan Selesai");
    }
}

