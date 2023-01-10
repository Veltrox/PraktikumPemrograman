package com.Satria.Pemrograman2.Pertemuan5;

import java.util.Scanner;

public class TestChallenge {

    public static void main(String[] args) {

        Barang[] belanjaan = new Barang[10];
        Scanner input = new Scanner(System.in);

        Barang[] etalase = {
                new Barang("Telkomsel", 10000),
                new Barang("Indosat", 20000),
                new Barang("XL", 30000),
                new Barang("Tri", 40000),
                new Barang("Smartfren", 50000),
                new Barang("Axis", 60000),
        };

        System.out.println("jumlah barang etalase " + etalase.length);

        System.out.println("daftar nama etalase: ");
        int i = 1;
        for (Barang b : etalase) {
            b.showInfo();
            i++;
        }

        //user menambahkan data baru ke dalam array etalase
        System.out.println("masukan nama barang : ");
        String name = input.next();
        System.out.println("masukan harga barang : ");
        int price = input.nextInt();
        Barang[] etalase2 = new Barang[etalase.length + 1];
        for (int j = 0; j < etalase.length; j++) {
            etalase2[j] = etalase[j];
        }
        etalase2[etalase.length] = new Barang(name, price);
        etalase = etalase2;


        //user memasukan object barang ke keranjang
        System.out.println("masukan barang ke keranjang");
        System.out.println("masukan nama barang : ");
        String pilihanbarang = input.next();
        System.out.println("masukan jumlah barang yang ingin dibeli : ");
        int totalbarang = input.nextInt();
        System.out.println("checkout");


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

