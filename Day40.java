package day40coding;
import java.util.Scanner;
public class Day40coding {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("masukkan a     = ");
        int a = input.nextInt();
        System.out.print("pilih operator = ");
        char operator = input.next().charAt(0);
        System.out.print("masukkan b     = ");
        int b = input.nextInt();
        
        if (operator == '+' ) {
            System.out.println(a + b);
        }else if (operator == '-' ) {
            System.out.println(a - b);
        }else if (operator == '*' ) {
            System.out.println(a * b);
        }else if (operator == '/' ) {
            System.out.println(a / b);
        }else{
            System.out.println("\noperator tidak valid");
        }
        
        
    }
}
