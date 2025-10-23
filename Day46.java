package day46coding
import java.util.Scanner;

public class Day46coding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih buah (1-3):");
        System.out.println("1. Strawberry");
        System.out.println("2. Mangga");
        System.out.println("3. Apel");
        System.out.print("Pilihanmu: ");

        int buah = input.nextInt();

        switch (buah) {
            case 1:
                System.out.println("Kamu memilih: Strawberry");
                break;
            case 2:
                System.out.println("Kamu memilih: Mangga");
                break;
            case 3:
                System.out.println("Kamu memilih: Apel");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
