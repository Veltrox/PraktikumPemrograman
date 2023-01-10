package Kuis_Cutie.Komposisi;

public class Fakultas {
    private String idFakultas;
    private String namaFakultas;
    private int pencacah;
    private Prodi[] prodi;


    public Fakultas(String idFakultas, String namaFakultas, int pencacah) {
        this.idFakultas = idFakultas;
        this.namaFakultas = namaFakultas;
        this.pencacah = pencacah;
        this.prodi = prodi;
    }

    public void tambahProdi(String idProdi, String namaProdi) {
        System.out.println("ID Prodi : " + Prodi.getIdProdi());
        System.out.println("Nama Prodi : " + Prodi.getNamaProdi());
    }

    public void tampilFakultas() {
        System.out.println("ID Fakultas : " + idFakultas);
        System.out.println("Nama Fakultas : " + namaFakultas);
        System.out.println("Jumlah Prodi : " + pencacah);
        System.out.println("\n");
    }
}


