package test.lingkaran.lingkaran;
import java.util.Scanner;

public class kurnia {
        public static void main(String[] args)
        {
            System.out.print("Masukkan jari-jari bola : ");
            Scanner input = new Scanner(System.in);
            double jari = input.nextDouble();
            System.out.println("Volume bola adalah " + 4*3.14*jari*jari*jari/3);
        }
    }

