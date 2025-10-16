package day39coding;
import java.util.Scanner;
public class Day39coding {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. NASI GORENG");
        System.out.println("2. AYAM KRISPI");
        System.out.println("3. IKAN BAKAR");
        System.out.print("\nPilih menu (1-3): ");
        
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Kamu memesan : NASI GORENG");
        } else if (pilihan == 2) {
            System.out.println("Kamu memesan : AYAM KRISPI");
        } else if (pilihan == 3) {
            System.out.println("Kamu memesan : IKAN BAKAR");
        } else {
            System.out.println("Menu tidak ada");
        }

    }
    
}
