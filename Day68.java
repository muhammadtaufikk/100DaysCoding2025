package day68coding;
import java.util.Scanner;
public class Day68coding {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int n = l.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
