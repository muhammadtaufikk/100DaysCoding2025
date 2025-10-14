package day37coding;
import java.util.Scanner;
public class Day37coding {
    public static void main(String[] args) {
        Scanner l = new Scanner (System.in);
        
        System.out.print("masukkan angka = ");
        int angka = l.nextInt();
        
        if (angka %2==0){
            System.out.println("\nbilangan genap");
        }else{
            System.out.println("\nbilangan ganjil");
        }
            
    }
}
