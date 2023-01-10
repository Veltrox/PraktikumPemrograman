package com.Satria.Pemrograman2.Pertemuan6.Tugas;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {
    public static void main(String args[])  {
        try {
            System.out.println("Membuka file...");
            File file = new File("D:\\Test\\Turu.txt");

            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("\nFile tidak ditemukan");
        }
    }
}
