package com.Satria.Pemrograman2.Pertemuan5;

public class Barang {
    String nama;
    int harga;

    public Barang() {
    }

    public Barang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void showInfo(){
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga Barang: " + harga);
        System.out.println();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
