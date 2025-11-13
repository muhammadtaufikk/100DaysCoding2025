package day67coding;
import java.util.Scanner;

public class Day67coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah bintang (n): ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }
}
