package TestingProgram;

import java.util.Scanner;

public class DynamicArrayBuah {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Program Input Buah\n");
        System.out.print("Masukkan Jumlah Buah: ");
        int jumlah = input.nextInt();

        //Deklarasi array
        String buah[] = new String[jumlah];

        //Input data ke array
        for (int i = 0; i < buah.length; i++) {
            System.out.println("Kata ke " + (i + 1) + " : ");
            buah[i] = input.next();
        }
        //Menampilkan data dalam array
        System.out.println("Kata-kata yang dimasukan");
        for (int i = 0; i < buah.length; i++) {
            System.out.println(buah[i]);
        }
    }
}
