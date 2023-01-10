package com.Satria.Pemrograman2.Pertemuan2;
import java.util.Scanner;

class FaktorialAngka {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int faktorial = 1;
        System.out.println("Masukkan bilangan : ");
        int j = in.nextInt();
        if (j <= 0){
            System.out.println("Harap masukkan bilangan bulat atau selain 0!! ");
        } else {
            for (int i = 1; i <= j; i++){
                faktorial *= i;
            }
            System.out.println("Hasil faktorial dari " + String.valueOf(j) + "! adalah " + String.valueOf(faktorial));
        }
    }
}