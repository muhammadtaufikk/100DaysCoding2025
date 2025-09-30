package pkgday23coding;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float panjang, lebar;
        System.out.print("masukkan panjang = ");
        panjang = input.nextFloat();
        
        System.out.print("masukkan lebar = ");
        lebar = input.nextFloat();
        
        float luas = panjang * lebar;
        System.out.printf("\njadi luas persegi = %.2f " , luas);
        
        
    }
    
}
