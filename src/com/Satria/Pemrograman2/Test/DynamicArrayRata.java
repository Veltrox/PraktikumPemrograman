package com.Satria.Pemrograman2.Test;
import java.util.Scanner;

public class DynamicArrayRata {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nilai_count, i;
        float total, rata2;

        System.out.print("Program Input Nilai\n");
        System.out.print("Masukkan Jumlah Nilai: ");
        nilai_count = input.nextInt();
        System.out.println();

        int[] nilai = new int[nilai_count];

        for ( i = 0; i < nilai_count; i++) {
            System.out.print("Masukkan Nilai Ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.println();

        System.out.println("Daftar Nilai");
        for ( i = 0; i < nilai.length; i++) {
            System.out.println("Nilai Matkul " + (i + 1) + ": " + nilai[i]);
        }

        // cari total semua element array
        total = 0;
        for(i = 0; i < nilai_count; i++){
            total = total+nilai[i];
        }

        // hitung nilai rata-rata
        rata2 = (total/nilai_count);
        System.out.println("Nilai rata-rata dari "+ nilai_count +
                " inputan adalah: "+ rata2);
    }
}
