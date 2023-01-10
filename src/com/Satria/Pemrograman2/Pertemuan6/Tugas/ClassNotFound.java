package com.Satria.Pemrograman2.Pertemuan6.Tugas;

public class ClassNotFound {
    public static void main(String[] args) {
        try{
            System.out.println("Mencari Kelas");
            Class.forName("Angka");
        }
        catch (ClassNotFoundException e){
            System.out.println("Kelas tidak ditemukan");
        }
    }
}

