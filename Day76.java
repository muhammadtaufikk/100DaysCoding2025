package day76coding;
import java.util.Scanner;
public class Day76coding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan teks pertama: ");
        String teks1 = input.nextLine();

        System.out.print("Masukkan teks kedua: ");
        String teks2 = input.nextLine();

        if (teks1.isEmpty()) {
            System.out.println("Teks pertama kosong!");
        } else {
            System.out.println("Teks pertama tidak kosong.");
        }

        if (teks1.equals(teks2)) {
            System.out.println("equals: Kedua teks sama persis.");
        } else {
            System.out.println("equals: Kedua teks berbeda.");
        }

        if (teks1.equalsIgnoreCase(teks2)) {
            System.out.println("equalsIgnoreCase: Kedua teks sama");
        } else {
            System.out.println("equalsIgnoreCase: Kedua teks berbeda");
        }

        if (teks1.contains(teks2)) {
            System.out.println("contains: Teks pertama mengandung teks kedua.");
        } else {
            System.out.println("contains: Teks pertama tidak mengandung teks kedua.");
        }

    }
}
