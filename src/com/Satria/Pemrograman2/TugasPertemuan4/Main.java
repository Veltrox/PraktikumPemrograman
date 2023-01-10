package com.Satria.Pemrograman2.TugasPertemuan4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Binatang bn = new Binatang();

    System.out.println("---Nama Binatang dan Jenis Binatang---");
    System.out.println("List Binatang: ");
    System.out.println("1. Kucing");
    System.out.println("2. Elang");
    System.out.print(" ");
    System.out.print("Masukkan pilihan binatang: ");
    int masukkan = input.nextInt();

    if(masukkan == 1){
        Kucing k = new Kucing();
        k.setNama("Kucing");
        k.setJenishewan("Mamalia");
        k.hewan();
        System.out.println(" ");
        System.out.println("FYI :");
        System.out.println("Hewan Ini Memiliki Ciri Khusus");
        k.setJumlahkaki("4");
        k.setJeniskulit("Bulu");
        k.extraInfo();
    }
    else if(masukkan == 2){
        Elang e = new Elang();
        e.setNama("Elang");
        e.setJenishewan("Unggas");
        e.hewan();
        System.out.println(" ");
        System.out.println("FYI :");
        System.out.println("Hewan Ini Memiliki Ciri Khusus");
        e.setJenisMulut("Paruh");
        e.setAlatGerak("Sayap");
        e.extraInfo();
    }
    else{
        System.out.println("Pilihan tidak ada");
    }
    }
}
