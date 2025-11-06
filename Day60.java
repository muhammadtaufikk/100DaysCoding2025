package day60coding;
import java.util.Scanner;
public class Day60coding {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N : ");
        int n = input.nextInt();

        System.out.println("Bilangan Ganjil");
        for (int i = n; i > 0; i--) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println("Bilangan Genap");
        for (int i = n; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }
    
}
