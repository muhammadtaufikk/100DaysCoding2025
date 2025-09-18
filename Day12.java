package day12coding;
import java.util.Scanner;
public class Day12coding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama;
        String nim;
        int usia;
        float tinggiBadan;
        String hobi;
        
        System.out.print("Masukkan Nama = ");
        nama = input.nextLine();
        System.out.print("Masukkan Nim = ");
        nim = input.nextLine();
        System.out.print("Masukkan Hobi = ");
        hobi = input.nextLine();
        System.out.print("Masukkan Usia = ");
        usia = input.nextInt();
        System.out.print("Masukkan Tinggi Badan = ");
        tinggiBadan = input.nextFloat();
        
        System.out.println("\nBiodata Mahasiswa :");
        System.out.println("Nama Lengkap : " + nama);
        System.out.println("Nim          : " + nim);
        System.out.println("Usia         : " + usia);
        System.out.println("Tinggi Badan : " + tinggiBadan);
        System.out.println("Hobi         : " + hobi);
        
    
    }
    
}
