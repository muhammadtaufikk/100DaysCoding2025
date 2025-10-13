package day36coding;

import java.util.Scanner;

public class Day36coding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian: ");
        int nilai = input.nextInt();

        if (nilai >= 75) {
            System.out.println("Kamu dinyatakan LULUS");

            if (nilai >= 90) {
                System.out.println("Predikat: A (Sangat Baik)");
            } else if (nilai >= 80) {
                System.out.println("Predikat: B (Baik)");
            } else {
                System.out.println("Predikat: C (Cukup)");
            }

        } else {
            System.out.println("Kamu dinyatakan TIDAK LULUS");
        }


    }
}
