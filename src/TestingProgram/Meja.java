package TestingProgram;

import java.util.Scanner;

public class Meja {
    public static void main(String[] args) {

        // Membuat Array dan Scanner
        String[][] meja = new String[2][3];
        Scanner scan = new Scanner(System.in);

        // mengisi setiap meja
        for (int Baris = 0; Baris < meja.length; Baris++) {
            for (int kol = 0; kol < meja[Baris].length; kol++) {
                System.out.format("Yang akan duduk di meja (Kolom ke-%d,Baris ke-%d): ", Baris, kol);
                meja[Baris][kol] = scan.nextLine();
            }
        }

        // menampilkan isi Array
        System.out.println("-------------------------");
        for (int Baris = 0; Baris < meja.length; Baris++) {
            for (int kol = 0; kol < meja[Baris].length; kol++) {
                System.out.format("| %s | \t", meja[Baris][kol]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
    }
}
