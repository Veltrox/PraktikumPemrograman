package Manak;

public class Pegawai {
    protected String npp;
    protected String nama;
    protected Double gaji;

    public Pegawai() {
    }

    public Pegawai(String npp, String nama, Double gaji) {
        this.npp = npp;
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getNpp() {
        return npp;
    }

    public void setNpp(String npp) {
        this.npp = npp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Double getGaji() {
        return gaji;
    }

    public void setGaji(Double gaji) {
        this.gaji = gaji;
    }

    public void showData() {
        System.out.println(" ");
        System.out.println("---------Data Pegawai---------");
        System.out.println("NPP : " + getNpp());
        System.out.println("Nama : " + getNama());
        System.out.println("Gaji : " + getGaji());
    }
}
