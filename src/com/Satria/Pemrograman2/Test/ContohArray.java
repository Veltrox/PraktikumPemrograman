package com.Satria.Pemrograman2.Test;

public class ContohArray {

    // Deklarasi variable array tanpa ukuran
    static int[] arrayInt;

    // deklarasi variable array dengan ukuran
    static String[] arrayString = new String[5];

    // deklarasi variable array dengan nilainya langsung
    static String[] arrayStringHuruf = {"a","b","c"};

    public static void main(String[] args) {
        // Menentukan besarnya array
        arrayInt = new int[10];

        // menetapkan isi dari array
        for(int i = 0; i < arrayInt.length; i++){
            arrayInt[i] = i+1;
        }

        // cek nilai arrayInt
        for(int i = 0; i < arrayInt.length; i++){
            System.out.println(arrayInt[i]);
        }

        // baris baru
        System.out.println();

        // menetapkan isi dari array String
        arrayString[0] = "a";
        arrayString[1] = "b";
        arrayString[2] = "c";
        arrayString[3] = "d";
        arrayString[4] = "e";

        // cek nilai arrayString
        for(int i = 0; i < arrayString.length; i++){
            System.out.println(arrayString[i]);
        }

        // baris baru
        System.out.println();

        // cek nilai arrayStringHuruf
        for(int i = 0; i < arrayStringHuruf.length; i++){
            System.out.println(arrayStringHuruf[i]);
        }
    }

}
