package com.Satria.Pemrograman2.TugasPertemuan4;

public class Binatang {

    String nama;

    String jenishewan;

    public Binatang() {
    }

    public Binatang(String nama, String jenishewan) {
        this.nama = nama;
        this.jenishewan = jenishewan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenishewan() {
        return jenishewan;
    }

    public void setJenishewan(String jenishewan) {
        this.jenishewan = jenishewan;
    }

    public void showInfo(){
        System.out.println("Nama Binatang: " + nama);
        System.out.println("Jenis Binatang: " + jenishewan);

        extraInfo();
    }

    public void hewan(){
        System.out.println("Hewan ini bernama " + nama + " dan jenisnya adalah " + jenishewan);
    }

    public void extraInfo() {};
}
