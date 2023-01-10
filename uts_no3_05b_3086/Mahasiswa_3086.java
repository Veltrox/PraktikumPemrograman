package com.kurnianurulnisa.uts_no3_05b_3086;

public abstract class Mahasiswa_3086 {
    protected String nim_3086;
    protected String nama_3086;
    protected String jurusan_3086;
    protected int ipk_3086;
    
    public Mahasiswa_3086(String nim, String nama, String jurusan, int ipk){
        this.nim_3086 = nim;
        this.nama_3086 = nama;
        this.jurusan_3086 = jurusan;
        this.ipk_3086 = ipk;
    }
    
    public abstract void tampilDataMhs();
}
