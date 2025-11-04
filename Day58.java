package day58coding
import java.util.Scanner;
public class Day58coding {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = l.nextInt();

        System.out.println("Angka 1 - N:");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Angka N - 1:");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
