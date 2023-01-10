package TestLingkaranMas;

public class Lingkaran {
    private float jejari;
    private Titik titikpusat;

    public Lingkaran(float sbx, float sby) {
        this.jejari = jejari;
        this.titikpusat = new Titik(sbx, sby);
    }

    public Lingkaran(float r) {
        this.jejari = r;
    }

    public void displayLingkaran() {
        System.out.println("Lingkaran: ");
        titikpusat.displayTitik();
        System.out.println("\nJejari: " + jejari);
        System.out.println("Luas: " + Luas());
        System.out.println("Keliling: " + Keliling());
    }

    public float Luas() {
        float luas = (float) (3.14 * jejari * jejari);
        return luas;
    }

    public float Keliling() {
        float keliling = (float) (2 * 3.14 * jejari);
        return keliling;
    }
}
