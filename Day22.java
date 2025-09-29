package pkgday22coding;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan panjang sisi persegi = ");
        int sisi = input.nextInt();
        
        int luas = sisi * sisi;
        
        System.out.println("jadi luas persegi adalah = " + luas);


    }
    
}
