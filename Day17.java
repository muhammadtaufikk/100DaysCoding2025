package day17coding;
import java.util.Scanner;
public class Day17coding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Operator Aritmatika Modulus :
        int a,b,hasil;
        System.out.println("Modulus(sisa bagi)");
        System.out.print("masukkan a = ");
        a = input.nextInt();
        System.out.print("masukkan b = ");
        b = input.nextInt();
        hasil = a % b;
        System.out.println("a % b = " + hasil);
        
        
    }
    
}
