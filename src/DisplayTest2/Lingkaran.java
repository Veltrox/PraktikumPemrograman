package DisplayTest2;

public class Lingkaran {
    private float jejari;
    private Titik titikpusat;

    public Lingkaran (float sbx, float sby, float r) {
        jejari = r;
        titikpusat = new Titik(sbx, sby);
    }

    public void displayLingkaran() {
        titikpusat.displayTitik();
        System.out.println("\nLingkaran: ");
        System.out.println("Jejari: " + jejari);
    }
}
