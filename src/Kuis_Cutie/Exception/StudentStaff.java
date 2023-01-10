package Kuis_Cutie.Exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentStaff {
    protected String nama;
    protected String nim;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public BufferedReader getInput() {
        return input;
    }

    public void setInput(BufferedReader input) {
        this.input = input;
    }

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public StudentStaff(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }


    public void tampilData() {
        try {
            System.out.println("Masukkan Nama: ");
            nama = input.readLine();
            System.out.println("Masukkan NIM: ");
            nim = input.readLine();
        } catch (Exception e) {
            System.out.println("Terjadi error, tidak dapat diproses");
        }
    }
}
