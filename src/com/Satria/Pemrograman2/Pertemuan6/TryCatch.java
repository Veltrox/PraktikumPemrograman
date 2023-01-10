package com.Satria.Pemrograman2.Pertemuan6;

public class TryCatch {
    public static void main(String[] args) {
        //Bikin array
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[60]);
            System.out.println("Selesai");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi error, array tidak luas nyeh");
        }
    }
}
