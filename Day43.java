package day43coding;
import java.util.Scanner;
public class Day43coding {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("masukkan angka = ");
        int angka = input.nextInt();
        
        if (angka %3==0 && angka %5==0){
            System.out.println("Ini adalah kelipatan 3 dan 5");
        }else if (angka %3==0){
            System.out.println("Ini adalah kelipatan 3");
        }else if (angka %5==0){
            System.out.println("Ini adalah kelipatan 5");
        }else{
            System.out.println("Bukan Kelipatan 3 atau 5");
        }
        
        
    }
    
}
