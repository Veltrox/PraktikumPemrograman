package Kuis_Cutie.Komposisi;

public class Prodi {
    private static String idProdi;
    private static String namaProdi;

    public Prodi(String idProdi, String namaProdi) {
        this.idProdi = idProdi;
        this.namaProdi = namaProdi;
    }

    public static String getIdProdi() {
        return idProdi;
    }

    public void setIdProdi(String idProdi) {
        this.idProdi = idProdi;
    }

    public static String getNamaProdi() {
        return namaProdi;
    }

    public void setNamaProdi(String namaProdi) {
        this.namaProdi = namaProdi;
    }
    public void tampilProdi() {;
        System.out.println("ID Prodi : " + idProdi);
        System.out.println("Nama Prodi : " + namaProdi);
    }
}
