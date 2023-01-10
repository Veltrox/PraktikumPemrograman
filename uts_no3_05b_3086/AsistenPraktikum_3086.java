package com.kurnianurulnisa.uts_no3_05b_3086;

public class AsistenPraktikum_3086 extends Mahasiswa_3086 implements iPendapatan{
    String mkAsistensi_3086;
    int jmlPertemuan_3086;
    
    public AsistenPraktikum_3086(String mkAsistensi, int jmlPertemuan, String nim,
            String nama, String jurusan, int ipk){
        super(nim,nama,jurusan,ipk);
        this.mkAsistensi_3086 = mkAsistensi;
        this.jmlPertemuan_3086 = jmlPertemuan;
    }
    
    public int getJumlahPertemuan(){
        return jmlPertemuan_3086;
    }   
    
    public void setJumlahPertemuan(int jumlahPertemuan){
        this.jmlPertemuan_3086 = jmlPertemuan_3086;
    }

    @Override
    public void tampilDataMhs() {
        System.out.println("NIM                  : " + nim_3086);
        System.out.println("Nama                 : " + nama_3086);
        System.out.println("Jurusan              : " + jurusan_3086);
        System.out.println("IPK                  : " + ipk_3086);
        System.out.println("MK Asistensi         : " + mkAsistensi_3086);
        System.out.println("Jumlah Pertemuan     : " + jmlPertemuan_3086);
        
    }

    @Override
    public double totalPendapatan() {
       double totalPendapatan;
       return totalPendapatan = jmlPertemuan_3086 * 50000;
    }
}
