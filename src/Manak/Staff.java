package Manak;

public class Staff extends Pegawai {
    private int jamKerja;
    private int jamLembur;

    public Staff() {
    }

    public Staff(int jamKerja, int jamLembur) {
        this.jamKerja = jamKerja;
        this.jamLembur = jamLembur;
    }

    public Staff(String npp, String nama, Double gaji, int jamKerja, int jamLembur) {
        super(npp, nama, gaji);
        this.jamKerja = jamKerja;
        this.jamLembur = jamLembur;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getJamLembur() {
        return jamLembur;
    }

    public void setJamLembur(int jamLembur) {
        this.jamLembur = jamLembur;
    }


    public void showData() {
        System.out.println("");
        System.out.println("---------Data Staff---------");
        System.out.println("NPP : " + getNpp());
        System.out.println("Nama : " + getNama());
        System.out.println("Gaji : " + getGaji());
        System.out.println("Jam Kerja : " + jamKerja);
        System.out.println("Jam Lembur : " + jamLembur);
        System.out.println("Total Gaji : " + totalGaji());
    }

    public double totalGaji() {
        return getGaji() + (jamKerja * 100000) + (jamLembur * 50000);
    }
}
