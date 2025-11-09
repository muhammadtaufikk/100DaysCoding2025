package day63coding;
import java.util.Scanner;
public class Day63coding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }

        System.out.println("Hasil perkalian 1 sampai " + n + " adalah: " + hasil);
    }
}
