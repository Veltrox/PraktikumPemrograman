package Lingkaran;

public class Main {
    public static void main(String[] args) {
        Lingkaran ls = new Lingkaran(4.5F, 2.5F);
        ls.displayLingkaran();

        Tabung tb = new Tabung(4,5,5,10);
        tb.displayTabung();
        tb.Volume();

    }
}
