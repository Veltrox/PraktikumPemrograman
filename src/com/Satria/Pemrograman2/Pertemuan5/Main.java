package com.Satria.Pemrograman2.Pertemuan5;

public class Main {
    public static void main(String[] args) {
        //Membua Array Kosong
        Barang[] keranjang = new Barang[10];

        //Me=ngisi array secara langsung
        Barang[] etalase = {
                new Barang("Telkomsel", 10000),
                new Barang("Indosat", 20000),
                new Barang("XL", 30000),
                new Barang("Tri", 40000),
                new Barang("Smartfren", 50000),
                new Barang("Axis", 60000),
        };

        //menampilkan panjang data array
        System.out.println("Jumlah Barang di Etalase: " + etalase.length);

        //menampilkan data array
        System.out.println("Daftar Barang di Etalase: ");
        int i = 1;

        //perulangan dengan for each untuk menggunakan sebuah objek
        for(Barang b : etalase){
            System.out.println("Barang ke-" +i);
            b.showInfo();
            i++;
        }

        //for i biasa
        for (int x=0; x<etalase.length; x++){
            System.out.println("Barang ke-" +i);
            etalase[x].showInfo();
            i++;
        }
    }
}
