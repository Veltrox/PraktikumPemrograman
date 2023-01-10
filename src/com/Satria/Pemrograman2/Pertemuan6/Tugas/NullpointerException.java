package com.Satria.Pemrograman2.Pertemuan6.Tugas;

public class NullpointerException {
    public static void main(String[] args) {
        Barang obj = new Barang();

        obj.setKode("1001");
        obj.setNama("Pensil Alis");

        System.out.println("\nKode : " + obj.getKode());
        System.out.println("Nama : " + obj.getNama());
    }
}

