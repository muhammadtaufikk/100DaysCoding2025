package day73coding;
import java.util.Scanner;
public class Day73coding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;
        int total = 0;

        System.out.println("Program penjumlahan. Masukkan angka (berhenti jika negatif):");
        System.out.print("Masukkan angka: ");
        angka = input.nextInt();

        while (angka >= 0) {
            total += angka; 
            System.out.println("Total sementara = " + total);

            System.out.print("Masukkan angka: ");
            angka = input.nextInt();  // input lagi
        }
        System.out.println("\nProgram selesai. Total akhir = " + total);
    }
}
