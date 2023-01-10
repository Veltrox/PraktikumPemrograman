package com.Satria.Pemrograman2.Pertemuan5;

import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Barang[] belanjaan = new Barang[10];

        Barang[] etalase = {
                new Barang("Telkomsel", 10000),
                new Barang("Indosat", 20000),
                new Barang("XL", 30000),
                new Barang("Tri", 40000),
                new Barang("Smartfren", 50000),
                new Barang("Axis", 60000),
        };


        // Menampilkan panjang array
        System.out.println("Jumlah Barang di etlase : " + etalase.length);

        //Menampilkan isi array
        System.out.println("Daftar Barang : ");
        System.out.println("");
        int i = 1;

        //for each = perulangan dengan menggunakan sebuah object
        for (Barang barang : etalase) {
            System.out.println("Barang ke-" + i);
            barang.showInfo();
            i++;
        }

        System.out.println("Masukkan Barang yang ingin dibeli : ");
        String pilihanbarang = input.nextLine();
        System.out.println("Masukkan Jumlah Barang yang ingin dibeli : ");
        int totalbarang = input.nextInt();

        //for
        for (Barang belanja : etalase) {
            if (belanja.getNama().equals(pilihanbarang)) {
                belanjaan[0] = new Barang(belanja.getNama(), belanja.getHarga());
                belanjaan[0].getNama();
                int harga = belanjaan[0].getHarga();
                int total = harga * totalbarang;
                System.out.println("Barang yang ingin dibeli : " + belanjaan[0].getNama());
                System.out.println("Total Belanjaan : " + total);
            }
        }
    }
}
