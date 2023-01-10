package Lingkaran;

public class Titik {
    private float sumbuX, sumbuY;

    public Titik(float X, float Y) {
        this.sumbuX = X;
        this.sumbuY = Y;
    }

    public void displayTitik() {
        System.out.println("Titik Pusat: ");
        System.out.println("Koordinat : [" + sumbuX + "," + sumbuY + "]");
    }
}
