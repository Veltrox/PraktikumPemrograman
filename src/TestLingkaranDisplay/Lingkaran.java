package TestLingkaranDisplay;

public class Lingkaran {
    private float jarijari;
    private Titik titikpusat;

    public Lingkaran(Titik tp, float r) {
        this.titikpusat = tp;
        this.jarijari = r;
    }

    public void displayLingkaran() {
        System.out.println("Lingkaran: ");
        titikpusat.displayTitik();
        System.out.println("Jari-jari: " + jarijari);
    }
}
