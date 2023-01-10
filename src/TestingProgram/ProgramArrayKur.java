package TestingProgram;

public class ProgramArrayKur {
    public static void main(String[] args) {

        String[] Buah = {"Apel", "Jeruk", "Pir", "Nangka", "Mangga", "Pisang", "Jambu", "Melon", "Semangka", "Anggur"};

        System.out.println("Banyaknya Jenis Buah : " + Buah.length);

        System.out.println("Daftar Buah");
        for (int i = 0; i < Buah.length; i++) {
            System.out.println((i) + ": " + Buah[i]);
        }
    }
}