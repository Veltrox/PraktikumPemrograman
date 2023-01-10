package com.Satria.Pemrograman2.Test;

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Program Input Nilai");
        System.out.print("Masukkan Jumlah Matkul: ");
        int length = input.nextInt();
        System.out.println();

        int[] nilai = new int[length];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan Nilai Ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.println();

        System.out.println("Daftar Nilai");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai Matkul " + (i + 1) + ": " + nilai[i]);
        }
        System.out.println();
    }
}
