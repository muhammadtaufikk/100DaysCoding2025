package day74coding;
import java.util.Scanner;
public class Day74coding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Salam");
            System.out.println("2. Info");
            System.out.println("3. Keluar");
            System.out.print("\nPilih Menu 1-3 : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Halo!");
                    break;

                case 2:
                    System.out.println("Ini adalah program menu sederhana dari perulangan do while.");
                    break;

                case 3:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak ada.");
            }

            System.out.println();
        } while (pilihan != 3);
    }
}
