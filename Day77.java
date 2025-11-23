package day77coding;
import java.util.Scanner;
public class day77coding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah teks: ");
        String teks = input.nextLine();

        String teksTrim = teks.trim();

        System.out.print("Ambil substring mulai indeks ke: ");
        int start = input.nextInt();
        System.out.print("Sampai indeks ke (tidak termasuk): ");
        int end = input.nextInt();
        String sub = teksTrim.substring(start, end);

        input.nextLine();

        System.out.print("Kata yang ingin diganti: ");
        String lama = input.nextLine();
        System.out.print("Diganti menjadi: ");
        String baru = input.nextLine();
        String teksReplace = teksTrim.replace(lama, baru);

        System.out.println("\n=== HASIL MANIPULASI STRING ===");
        System.out.println("Teks asli: " + teks);
        System.out.println("Setelah trim: " + teksTrim);
        System.out.println("Hasil substring: " + sub);
        System.out.println("Setelah replace: " + teksReplace);
    }
}
