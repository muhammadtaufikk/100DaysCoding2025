package day45coding
import java.util.Scanner;

public class Day45coding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih hari (1-3):");
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.print("Pilihanmu: ");

        int hari = input.nextInt();

        switch (hari) {
            case 1:
                System.out.println("Kamu memilih hari Senin");
                break;
            case 2:
                System.out.println("Kamu memilih hari Selasa");
                break;
            case 3:
                System.out.println("Kamu memilih hari Rabu");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
