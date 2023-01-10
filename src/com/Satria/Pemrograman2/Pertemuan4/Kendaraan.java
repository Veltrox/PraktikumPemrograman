package com.Satria.Pemrograman2.Pertemuan4;

public class Kendaraan {
    String nama;
    int jmlroda;

    //Constructor
    public Kendaraan() {}

    public Kendaraan(String nama, int jmlroda) {
        this.nama = nama;
        this.jmlroda = jmlroda;
    }

    public void nyalakanMesin(){
        System.out.println("Mesin " + nama + " telah dinyalakan!");
    }

    public void showInfo(){
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Jumlah roda: " + jmlroda);

        extraInfo();
    }
    public void extraInfo() {};
}
