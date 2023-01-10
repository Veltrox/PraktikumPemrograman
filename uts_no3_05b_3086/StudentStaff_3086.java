package com.kurnianurulnisa.uts_no3_05b_3086;

public class StudentStaff_3086 extends Mahasiswa_3086 implements iPendapatan{
    int unitKerja_3086;
    int jamKerja_3086;
    
    public StudentStaff_3086(int unitKerja, int jamKerja, String nim,
            String nama, String jurusan, int ipk){
        super(nim,nama,jurusan,ipk);
        this.unitKerja_3086 = unitKerja;
        this.jamKerja_3086 = jamKerja;
    }
    
    public int getJamKerja(){
        return jamKerja_3086;
    }   
    
    public void setJamKerja(int jamKerja){
        this.jamKerja_3086 = jamKerja;
    }
    
    public void tampilDataMhs() {
        System.out.println("NIM                  : " + nim_3086);
        System.out.println("Nama                 : " + nama_3086);
        System.out.println("Jurusan              : " + jurusan_3086);
        System.out.println("IPK                  : " + ipk_3086);
        System.out.println("Unit Kerja           : " + unitKerja_3086);
        System.out.println("Jam Kerja            : " + jamKerja_3086);
    }

    public double totalPendapatan() {
        double totalPendapatan;
        return totalPendapatan = jamKerja_3086 * 30000;
    }
}