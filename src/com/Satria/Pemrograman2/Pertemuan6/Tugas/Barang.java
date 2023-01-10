package com.Satria.Pemrograman2.Pertemuan6.Tugas;

public class Barang {

    public String kode;
    public String nama;

    public void setKode(String KodeBarang) {
        try {
            kode = KodeBarang;
            if (kode == null) {
                throw new NullPointerException();
            }
        } catch (NullPointerException npe) {
            System.out.println("\n Ada Error : " + "Kode barang tidak boleh null(Kosong)");
        }
    }

    public String getKode() {
        return kode;
    }

    public void setNama(String NamaBarang) {
        try {
            nama = NamaBarang;
            if (nama == null) {
                throw new NullPointerException();
            }
        } catch (NullPointerException npe) {
            System.out.println("\nAda Error : " + "Nama barang tidak boleh null(Kosong)");
        }
    }

    public String getNama() {
        return nama;
    }

}