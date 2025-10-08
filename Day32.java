package day32coding;
import java.util.Scanner;
public class Day32coding {
    public static void main(String[] args) {
        Scanner l = new Scanner (System.in);
        
        System.out.print("Masukkan Umur = ");
        int umur = l.nextInt();
        System.out.print("Punya ID Card = ");
        boolean kartuAkses = l.nextBoolean();
        
        if (umur >= 17 || kartuAkses == true){
            System.out.println("\nBisa Ikut Event");
        }else{
            System.out.println("\nTidak Bisa Ikut Event");
        }
        
    }
}
