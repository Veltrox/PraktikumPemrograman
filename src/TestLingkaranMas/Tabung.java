package TestLingkaranMas;
public class Tabung {
    private float tinggi;
    private Titik titik;
    private Lingkaran lingkaran;

    public Tabung(float sbx, float sby, float rling, float t) {
        titik = new Titik(sbx, sby);
        lingkaran = new Lingkaran(rling);
        tinggi = t;
    }

    public float Volume() {
        float volume = (tinggi * lingkaran.Luas());
        System.out.println("Volume: " + volume);
        return volume;
    }

    public void displayTabung() {
        System.out.println("\nTabung: ");
        System.out.println("Tinggi: " + tinggi);
    }
}
