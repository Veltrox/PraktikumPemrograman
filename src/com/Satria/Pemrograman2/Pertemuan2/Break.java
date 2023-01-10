package com.Satria.Pemrograman2.Pertemuan2;

public class Break {
    public static void main(String[] args) {
        //while
        int j = 1;
        while (j <= 100) {
            System.out.println("Loading...(" + j + "%)");
            j += 10;

            if (j == 50) {
                System.out.println("Udah ah, capek!");
                break;
            }
        }
        System.out.println("Looping While selesai! \n");
    }
}
