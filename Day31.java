package day31coding;
import java.util.Scanner;
public class Day31coding {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        
        System.out.print("Masukkan Umur       = ");
        int umur = masuk.nextInt();
        System.out.print("Apakah Memiliki KTP = ");
        boolean punyaKTP = masuk.nextBoolean();
        
        if (umur >= 17 && punyaKTP == true){
            System.out.println("\nBisa Buat SIM");
        }else{
            System.out.println("\nTidak Bisa Membuat SIM");
        }
        
    }
}
