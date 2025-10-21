package day44coding;
import java.util.Scanner;
public class Day44coding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai : ");
        int nilai = input.nextInt();

        if (nilai >= 85 && nilai <= 100) {
            System.out.println("Grade A");
        } else if (nilai >= 75 && nilai <= 85) {
            System.out.println("Grade B");
        } else if (nilai >= 60 && nilai <= 75) {
            System.out.println("Grade C");
        } else if (nilai >= 40 && nilai <= 60) {
            System.out.println("Grade D");
        } else if (nilai >= 0 && nilai <= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Nilai Tidak Valid");

        }

    }

}
