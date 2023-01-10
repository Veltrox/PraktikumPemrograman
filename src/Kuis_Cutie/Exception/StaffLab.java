package Kuis_Cutie.Exception;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StaffLab {
    public static void main(String[] args) {

    }
    private String idStaffLab;
    private String kodeLab;

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public StaffLab(String idStaffLab, String kodeLab) {
        this.idStaffLab = idStaffLab;
        this.kodeLab = kodeLab;
    }

    public void tampilData () {
        try {
            System.out.println("Masukkan ID Staff Lab: ");
            idStaffLab = input.readLine();
            System.out.println("Masukkan Kode Lab: ");
            kodeLab = input.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
