package pkgday25coding;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //operator increment (++)
        int x,y;

        System.out.println("Demonstrasi Increment");
        System.out.print("masukkan nilai x = ");
        x = input.nextInt();
        System.out.println("Nilai x awal = " + x);

        System.out.println("Pre-increment (++x) = " + (++x));
        System.out.println("Setelah pre-increment, x = " + x);

        System.out.println("Post-increment (x++) = " + (x++));
        System.out.println("Setelah post-increment, x = " + x);

        //operator decrement (--)
        System.out.println("\nDemonstrasi Decrement");
        System.out.print("masukkan nilai y = ");
        y = input.nextInt();
        System.out.println("Nilai y awal = " + y);

        System.out.println("Pre-decrement (--y) = " + (--y));
        System.out.println("Setelah pre-decrement, y = " + y);

        System.out.println("Post-decrement (y--) = " + (y--));
        System.out.println("Setelah post-decrement, y = " + y);
    }
}

        
        
        
        
