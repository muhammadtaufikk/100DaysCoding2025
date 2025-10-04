package evaluasi4okt2025;
import java.util.Scanner;
public class Evaluasi4Okt2025 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan panjang rumah = ");
        int pRumah = input.nextInt();
        System.out.print("masukkan lebar rumah   = ");
        int lRumah = input.nextInt();
        int totalKeramik = pRumah * lRumah / 4;
        System.out.println("\njadi minimal keramik yang\ndibutuhkan tukang adalah " + totalKeramik);
        
        
    }
    
}
