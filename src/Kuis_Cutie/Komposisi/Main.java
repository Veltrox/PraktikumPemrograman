package Kuis_Cutie.Komposisi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        Fakultas fakultas = new Fakultas("FIF", "Fakultas Informatika", 4);
        Prodi[] prodi = new Prodi[4];
        prodi[0] = new Prodi("SI", "Sistem Informasi");
        prodi[1] = new Prodi("IF", "Teknik Informatika");
        prodi[2] = new Prodi("SE", "Sistem Informasi");
        prodi[3] = new Prodi("DS", "Sains Data");

        fakultas.tampilFakultas();

        prodi[0].tampilProdi();
        prodi[1].tampilProdi();
        prodi[2].tampilProdi();
        prodi[3].tampilProdi();
    }
}
