package day51coding;
import java.util.Scanner;
public class Day51coding {
    public static void main(String[] args) {
    Scanner l = new Scanner(System.in);
    
        System.out.print("masukkan nilai awal  = ");
        int nilaiAwal = l.nextInt();
        System.out.print("masukkan nilai akhir = ");
        int nilaiAkhir = l.nextInt();
        for (int a = nilaiAwal; a <= nilaiAkhir; a++) {
            System.out.print(a + " ");
        }
            System.out.println("");
    }
 
}
