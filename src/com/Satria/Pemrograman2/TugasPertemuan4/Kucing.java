package com.Satria.Pemrograman2.TugasPertemuan4;

public class Kucing extends Binatang{

    String jumlahkaki;

    String jeniskulit;

    public Kucing() {
    }

    public Kucing(String nama, String jenishewan, String jumlahkaki, String jeniskulit) {
        super(nama, jenishewan);
        this.jumlahkaki = jumlahkaki;
        this.jeniskulit = jeniskulit;
    }

    public String getJumlahkaki() {
        return jumlahkaki;
    }

    public void setJumlahkaki(String jumlahkaki) {
        this.jumlahkaki = jumlahkaki;
    }

    public String getJeniskulit() {
        return jeniskulit;
    }

    public void setJeniskulit(String jeniskulit) {
        this.jeniskulit = jeniskulit;
    }

    public void extraInfo(){
        System.out.println("Memiliki kaki sebanyak " + jumlahkaki + " dan kulitnya ditutupi oleh " + jeniskulit);

    }
}
