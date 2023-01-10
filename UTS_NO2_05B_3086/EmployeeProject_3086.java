package UTS_NO2_05B_3086;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EmployeeProject_3086 {
    public static void main(String[] args) {
        SalariedEmployee_3086 se = new SalariedEmployee_3086();
        CommissionEmployee_3086 ce = new CommissionEmployee_3086();
        ProjectPlanner_3086 pp = new ProjectPlanner_3086();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        try{
            System.out.println("Data Pegawai");
            System.out.print("Nama: ");
            se.nama_3086 = br.readLine();
            System.out.print("NIP: ");
            se.nip_3086 = br.readLine();
            System.out.print("Gaji Pokok: ");
            se.GajiPokok_3086 = Float.parseFloat(br.readLine());
            se.TampilData();
            
            System.out.print("Nama: ");
            ce.nama_3086 = br.readLine();
            System.out.print("NIP: ");
            ce.nip_3086= br.readLine();
            System.out.print("GajiPokok: ");
            ce.GajiPokok_3086 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            ce.komisi_3086 = Float.parseFloat(br.readLine());
            System.out.print("Total Penjualan: ");
            ce.TotalPenjualan_3086= Float.parseFloat(br.readLine());
            ce.TotalGaji();
            ce.TampilData();
            
            System.out.print("Nama: ");
            pp.nama_3086 = br.readLine();
            System.out.print("NIP: ");
            pp.nip_3086= br.readLine();
            System.out.print("Gaji Pokok: ");
            pp.GajiPokok_3086 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            pp.komisi_3086 = Float.parseFloat(br.readLine());
            System.out.print("Total Hasil Proyek: ");
            pp.TotalHslProyek_3086 = Float.parseFloat(br.readLine());
            pp.TotalGaji();
            pp.TampilData();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
