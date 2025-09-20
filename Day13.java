package evaluasiday13;
import java.util.Scanner;
public class EvaluasiDay13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //1. Tampilan Awal Program Java:
        System.out.println("=== SELAMAT DATANG DI PROGRAM EVALUASI JAVA ===");
        
        //2. Input Data Diri (Scanner):
        String nama;
        String nim;
        String hobi;
        int usia;
        float tinggi;
        boolean status;
        
        
        System.out.print("\nMasukkan Nama    : ");
        nama = input.nextLine();
        System.out.print("Masukkan Nim     : ");
        nim = input.nextLine();
        System.out.print("Masukkan Hobi    : ");
        hobi = input.nextLine();
        System.out.print("Masukkan Usia    : ");
        usia = input.nextInt();
        System.out.print("Masukkan Tinggi  : ");
        tinggi = input.nextFloat();
        System.out.print("Status Mahasiswa : ");
        status = input.nextBoolean();
        
        System.out.println("\nBiodata Mahasiswa : ");
        System.out.println("Nama              : " + nama);
        System.out.println("Nim               : " + nim);
        System.out.println("Usia              : " + usia);
        System.out.println("Tinggi Badan      : " + tinggi);
        System.out.println("Hobi              : " + hobi);
        System.out.println("Status Mahasiswa  : " + status);
        
        //3. Operasi Variabel & Update:
        long tabungan = 1000000;
        
        System.out.print("\nMasukkan Tabungan = ");
        tabungan = input.nextLong();
        tabungan += 500000;
        System.out.println("Uang saku masuk, + Rp500.000 = " + tabungan);
        tabungan -= 200000;
        System.out.println("Uang dipakai belanja, - Rp200.000 = " + tabungan);
        
        //4. Hitung Luas Lingkaran:
        final double phi = 3.14159;
        System.out.print("\nMasukkan Jari jari = ");
        float r = input.nextFloat();
        double luas = phi*r*r;
        System.out.println("luas = " + luas);
            
            
        //5. Output Akhir (Biodata Lengkap):
        System.out.println("\nBiodata Mahasiswa : ");
        System.out.println("Nama              : " + nama);
        System.out.println("Nim               : " + nim);
        System.out.println("Usia              : " + usia + " Tahun");
        System.out.println("Tinggi Badan      : " + tinggi + "Cm");
        System.out.println("Hobi              : " + hobi);
        System.out.println("Status Mahasiswa  : " + status);
        System.out.println("Tabungan          : Rp " + tabungan);
        System.out.println("luas              : " + luas);
        
    }
    
}
