package com.kurnianurulnisa.uts_no3_05b_3086;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_3086 {
   public static void main(String[] args) {
     AsistenPraktikum_3086[] ap = new AsistenPraktikum_3086[1];
     StudentStaff_3086[] ss = new StudentStaff_3086[1];
        
      
        //program input menggunakan buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
           
            for(int i = 0; i < 1; i++){
                System.out.print("NIM              : ");
                ap[i].nim_3086 = br.readLine();
                System.out.print("Nama             : ");
                ap[i].nama_3086 = br.readLine();
                System.out.print("Jurusan          : ");
                ap[i].jurusan_3086 =br.readLine();
                System.out.print("IPK              : ");
                ap[i].ipk_3086 =Integer.parseInt(br.readLine());
                System.out.print("Mata Kuliah      : ");
                ap[i].mkAsistensi_3086= br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                ap[i].jmlPertemuan_3086= Integer.parseInt(br.readLine());
                System.out.println();
                ap[i].totalPendapatan();
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data nelayan
            System.out.println("DATA ASISTEN PRAKTIKUM");
            for(AsistenPraktikum_3086 AP : ap){
                AP.tampilDataMhs();
                System.out.println("");
            }

            //mengisi data ke array pada data dokter
            for(int i = 0; i < 1; i++){
                System.out.print("NIM         : ");
                ss[i].nim_3086 = br.readLine();
                System.out.print("Nama        : ");
                ss[i].nama_3086 = br.readLine();
                System.out.print("Jurusan     : ");
                ss[i].jurusan_3086 =br.readLine();
                System.out.print("IPK         : ");
                ss[i].ipk_3086 =Integer.parseInt(br.readLine());
                System.out.print(" Unit Kerja : ");
                ss[i].unitKerja_3086 = Integer.parseInt(br.readLine());
                System.out.print("Jam Kerja   : ");
                ss[i].jamKerja_3086 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data dokter
            System.out.println("DATA STUDENT STAFF");
            for(StudentStaff_3086 SS : ss){
                SS.tampilDataMhs();
                System.out.println("");
            }
        } 
        catch (Exception ex){ // menangkap kesalahan
            System.out.println(ex);
        }
    }
}
