package quiz_1_21103034;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        //Menambahkan object
        Nelayan_21103034 n1 = new Nelayan_21103034();
        Nelayan_21103034 n2 = new Nelayan_21103034();
        Dokter_21103034 d1 = new Dokter_21103034();
        Dokter_21103034 d2 = new Dokter_21103034();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("NIK : ");
            n1.nik = br.readLine();
            System.out.println("Nama : ");
            n1.nama = br.readLine();
            System.out.println("Umur : ");
            n1.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            n1.alamat = br.readLine();
            System.out.println("Jml Berat Ikan : ");
            n1.jmlBeratIkan = Integer.parseInt(br.readLine());
            System.out.println("Jml Pakai Solar : ");
            n1.jmlSolar = Integer.parseInt(br.readLine());
          
            System.out.println();

            System.out.println("NIK : ");
            n2.nik = br.readLine();
            System.out.println("Nama : ");
            n2.nama = br.readLine();
            System.out.println("Umur : ");
            n2.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            n2.alamat = br.readLine();
            System.out.println("Jml Berat Ikan : ");
            n2.jmlBeratIkan = Integer.parseInt(br.readLine());
            System.out.println("Jml Pakai Solar : ");
            n2.jmlSolar = Integer.parseInt(br.readLine());
            

            System.out.println("NIK : ");
            d1.nik = br.readLine();
            System.out.println("Nama : ");
            d1.nama = br.readLine();
            System.out.println("Umur : ");
            d1.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            d1.alamat = br.readLine();
            System.out.println("Jml Pasien : ");
            d1.jmlPasien = Integer.parseInt(br.readLine());
            System.out.println("Jml Obat : ");
            d1.jmlObat = Integer.parseInt(br.readLine());
            

            System.out.println();

            System.out.println("NIK : ");
            d2.nik = br.readLine();
            System.out.println("Nama : ");
            d2.nama = br.readLine();
            System.out.println("Umur : ");
            d2.umur = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            d2.alamat = br.readLine();
            System.out.println("Jml Pasien : ");
            d2.jmlPasien = Integer.parseInt(br.readLine());
            System.out.println("Jml Obat : ");
            d2.jmlObat = Integer.parseInt(br.readLine());
       

            System.out.println("=========== DATA NELAYAN ===========");
            n1.tampilDataPenduduk();
            n1.DataNelayan();
            n1.totalPendapatNelayan();
            
            System.out.println();
            
            n2.tampilDataPenduduk();
            n2.DataNelayan();
            n2.totalPendapatNelayan();
            
            System.out.println("=========== DATA DOKTER ===========");
            
            d1.tampilDataPenduduk();
            d1.DataDokter();
            d1.totalPendapatanDokter();
            
            System.out.println();
            
            d2.tampilDataPenduduk();
            d2.DataDokter();
            d2.totalPendapatanDokter();

        } catch (IOException eox) // menangkap kesalahan
        {
            System.out.println(eox);
        }
    }
}
