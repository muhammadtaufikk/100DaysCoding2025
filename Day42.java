package day42coding;
import java.util.Scanner;
public class Day42coding {
    public static void main(String[] args) {
        Scanner l = new Scanner (System.in);
        
            System.out.print("masukkan gaji pokok = Rp ");
            int gajiPokok = l.nextInt();
            System.out.print("masukkan tunjangan  = Rp ");
            int tunjangan = l.nextInt();
            
            int gajiKotor = gajiPokok + tunjangan;
            double pajak = 0.10 * gajiKotor;
            double gajiBersih = gajiKotor - pajak;
            
            System.out.println("\nGaji pokok  = Rp " + gajiPokok);
            System.out.println("Tunjangan   = Rp " + tunjangan);
            System.out.println("pajak (10%) = Rp " + pajak);
            System.out.println("Gaji bersih = Rp " + gajiBersih);
    }
    
}
