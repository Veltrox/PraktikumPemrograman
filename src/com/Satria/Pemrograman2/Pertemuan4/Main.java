package com.Satria.Pemrograman2.Pertemuan4;

public class Main {
    public static void main(String[] args) {

        Mobil mb = new Mobil( "Avanza", 4, 4, "Pertamax");
        Mobil mb2 = new Mobil ("Bugatti Chiron Super Sport",4 , 2, "Turbo");

        mb.showInfo();
        mb.nyalakanMesin();
        mb.belok("Kanan");
        mb.belok();

        mb2.showInfo();
        mb2.nyalakanMesin();
        mb2.belok("Kanan");
        mb2.belok();


    }
}
