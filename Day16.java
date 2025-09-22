package day16coding;
import java.util.Scanner;
public class Day16coding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Operator Aritmatika Perkalian:
        int a,b,hasil;
        System.out.println("Perkalian:");
        System.out.print("masukkan a : ");
        a = input.nextInt();
        System.out.print("masukkan b : ");
        b = input.nextInt();
        hasil = a * b;
        System.out.println("a x b  : " + hasil);
        
        //Operator Aritmatika Pembagian:
        System.out.println("\nPembagian :");
        System.out.print("masukkan a : ");
        a = input.nextInt();
        System.out.print("masukkan b : ");
        b = input.nextInt();
        hasil = a / b;
        System.out.println("a : b  : " + hasil);
        
    }
    
}
