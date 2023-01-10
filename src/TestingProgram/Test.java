package TestingProgram;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jumlah Kata : ");
        int n = input.nextInt();

        //Deklarasi array
        String kata[] = new String[n];

        //Input data ke array
        for (int i = 0; i < kata.length; i++) {
            System.out.print("Kata ke " + (i + 1) + " : ");
            kata[i] = input.next();
        }
        //Menampilkan data dalam array
        System.out.println("Kata-kata yang dimasukan");
        for (int i = 0; i < kata.length; i++) {
            System.out.println(kata[i]);
        }
    }
}

