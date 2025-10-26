package day49coding;
import java.util.Scanner;
public class Day49coding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Nilai : ");
        int nilai = input.nextInt();
        int syaratLulus = 75;
        String hasil = nilai > syaratLulus ? "Lulus" : "Tidak Lulus";
        System.out.println("\nMahasiswa ini dinyatakan " + hasil);

    }
}
