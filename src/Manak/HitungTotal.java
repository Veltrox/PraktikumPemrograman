package Manak;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HitungTotal {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Dosen ds = new Dosen();
        Staff st = new Staff();


        System.out.println("---Masukkan Pilihan Pegawai---");
        System.out.println("List Pegawai: ");
        System.out.println("1. Dosen");
        System.out.println("2. Staff");
        System.out.print(" ");
        System.out.print("Masukkan Pilihan Pegawai: ");
        int masukkan = Integer.parseInt(br.readLine());

        if(masukkan == 1){
            System.out.println("Masukkan Data Dosen");
            System.out.print("NPP: ");
            ds.npp = br.readLine();
            System.out.print("Nama: ");
            ds.nama = br.readLine();
            System.out.print("Gaji: ");
            ds.gaji = Double.valueOf(br.readLine());
            System.out.print("Jumlah Mata Kuliah: ");
            ds.setJumlahMatkul(Integer.parseInt(br.readLine()));
            System.out.print("Jumlah Sertifikasi: ");
            ds.setJumlahSertifikasi(Integer.parseInt(br.readLine()));
            ds.showData();

        }
        else if(masukkan == 2){
            System.out.println("Masukkan Data Staff");
            System.out.print("NPP: ");
            st.npp = br.readLine();
            System.out.print("Nama: ");
            st.nama = br.readLine();
            System.out.print("Gaji: ");
            st.gaji = Double.valueOf(br.readLine());
            System.out.print("Jumlah Jam Kerja: ");
            st.setJamKerja(Integer.parseInt(br.readLine()));
            System.out.print("Jumlah Hari Kerja: ");
            st.setJamLembur(Integer.parseInt(br.readLine()));
            st.showData();
        }
        else{
            System.out.println("Pilihan Tidak Tersedia");

        }
    }
}
