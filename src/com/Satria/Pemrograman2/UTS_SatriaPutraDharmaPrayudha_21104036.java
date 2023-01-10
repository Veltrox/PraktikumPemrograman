package com.Satria.Pemrograman2;
import java.util.Scanner;

public class UTS_SatriaPutraDharmaPrayudha_21104036 {
    public static void main(String[] args) {

        Scanner nama = new Scanner(System.in);
        System.out.println("Masukkan Nama: ");
        String NamaMahasiswa = nama.next();
        Scanner nim = new Scanner(System.in);
        System.out.println("Masukkan NIM: ");
        String NIMMahasiswa = nim.next();
        Scanner Makanan = new Scanner(System.in);
        System.out.println("Masukkan Makanan Favorit: ");
        String MakananFav = Makanan.next();
        Scanner Minuman = new Scanner(System.in);
        System.out.println("Masukkan Minuman Favorit: ");
        String MinumanFav = Minuman.next();


        System.out.println("Nama: " + NamaMahasiswa);
        System.out.println("Nim: " + NIMMahasiswa);
        System.out.println("Program Studi: S1 Rekayasa Perangkat Lunak");
        System.out.println("Mata Kuliah Favorit: Pemrograman 2");
        System.out.println("Makanan Favorit: " + MakananFav);
        System.out.println("Minuman Favorit: " + MinumanFav);
    }
}
