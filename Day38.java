package day38coding;
import java.util.Scanner;
public class Day38coding {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("masukkan angka = ");
        int angka = input.nextInt();
        
        if (angka > 0){
            System.out.println("ini adalah bilangan positif");
        }else if (angka < 0){
            System.out.println("ini adalah bilangan negatif");
        }else{
            System.out.println("ini adalah bilangan nol");
        }
        
        
    }
    
}
