package Lingkaran;

public class Tabung {
    private float tinggi;
    private Titik titikpusat;
    private Lingkaran jariling;

    public Tabung(float sbx, float sby, float rling, float t) {
        titikpusat = new Titik(sbx, sby);
        jariling = new Lingkaran(rling);
        tinggi = t;
    }
    public float Volume() {
        float volume = (tinggi * jariling.Luas());
        System.out.println("Volume: " + volume);
        return volume;
    }
    public void displayTabung() {
        System.out.println("\nTabung: ");
        System.out.println("Tinggi: " + tinggi);
    }
}
