package Manak;

public class Dosen extends Pegawai {
    private int jumlahMatkul;
    private int jumlahSertifikasi;

    public Dosen() {
    }

    public Dosen(int jumlahMatkul, int jumlahSertifikasi) {
        this.jumlahMatkul = jumlahMatkul;
        this.jumlahSertifikasi = jumlahSertifikasi;
    }

    public int getJumlahMatkul() {
        return jumlahMatkul;
    }

    public void setJumlahMatkul(int jumlahMatkul) {
        this.jumlahMatkul = jumlahMatkul;
    }

    public int getJumlahSertifikasi() {
        return jumlahSertifikasi;
    }

    public void setJumlahSertifikasi(int jumlahSertifikasi) {
        this.jumlahSertifikasi = jumlahSertifikasi;
    }

    public Dosen(String npp, String nama, Double gaji, int jumlahMatkul, int jumlahSertifikasi) {
        super(npp, nama, gaji);
        this.jumlahMatkul = jumlahMatkul;
        this.jumlahSertifikasi = jumlahSertifikasi;
    }


    public void showData() {
        System.out.println(" ");
        System.out.println("---------Data Dosen---------");
        System.out.println("NPP : " + getNpp());
        System.out.println("Nama : " + getNama());
        System.out.println("Gaji : " + getGaji());
        System.out.println("Jumlah Mata Kuliah : " + jumlahMatkul);
        System.out.println("Jumlah Sertifikasi : " + jumlahSertifikasi);
        System.out.println("Total Gaji : " + totalGaji());
    }

    public double totalGaji() {
        return getGaji() + (jumlahMatkul * 250000) + (jumlahSertifikasi * 100000);
    }

}
