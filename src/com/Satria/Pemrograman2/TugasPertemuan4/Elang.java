package com.Satria.Pemrograman2.TugasPertemuan4;

public class Elang extends Binatang{

    String JenisMulut;

    String AlatGerak;

    public Elang() {
    }

    public Elang(String nama, String jenishewan, String jenisMulut, String alatGerak) {
        super(nama, jenishewan);
        JenisMulut = jenisMulut;
        AlatGerak = alatGerak;
    }

    public String getJenisMulut() {
        return JenisMulut;
    }

    public void setJenisMulut(String jenisMulut) {
        JenisMulut = jenisMulut;
    }

    public String getAlatGerak() {
        return AlatGerak;
    }

    public void setAlatGerak(String alatGerak) {
        AlatGerak = alatGerak;
    }

    public void extraInfo(){
        System.out.println("Memiliki mulut yang berbentuk " + JenisMulut + " dan alat geraknya adalah " + AlatGerak);
    }
}

