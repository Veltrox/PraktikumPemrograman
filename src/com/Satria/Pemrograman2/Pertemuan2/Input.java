package com.Satria.Pemrograman2.Pertemuan2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama anda : ");
        String nama = input.nextLine();

        System.out.println("Selamat pagi, " + nama + "!");
    }
}
