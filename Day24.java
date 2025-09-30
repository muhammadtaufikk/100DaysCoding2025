package pkgday24coding;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        float r;
        final double phi = 3.14159;
        System.out.print("masukkan jari jari lingkaran = ");
        r = input.nextFloat();
        double luas = phi * r * r;
        
        System.out.printf("luas lingkaran = %.2f " , luas);
        System.out.println("");
        
    }
    
}
