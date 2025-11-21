package day75coding;
import java.util.Scanner;
public class Day75coding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kata atau kalimat: ");
        String teks = input.nextLine();

        System.out.println("Panjang teks: " + teks.length());

        System.out.println("Huruf besar: " + teks.toUpperCase());

        System.out.println("Huruf kecil: " + teks.toLowerCase());
    }
}
