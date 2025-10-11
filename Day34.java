package day34coding;

import java.util.Scanner;

public class Day34coding {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = in.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = in.nextInt();

        // Operator aritmatika
        int c = a + b;
        int d = a - b;

        // Operator perbandingan
        boolean e = a > b;

        // Operator logika dan modulus (cek genap)
        boolean f = (a % 2 == 0);
        boolean g = (b % 2 == 0);

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Penjumlahan: " + c);
        System.out.println("Pengurangan: " + d);
        System.out.println("Apakah a lebih besar dari b : " + e);
        System.out.println("Apakah a genap : " + f);
        System.out.println("Apakah b genap : " + g);

    }

}
