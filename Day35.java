package day35coding;
import java.util.Scanner;
public class Day35coding {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        
        System.out.print("masukan umur anda : ");
        int umur = l.nextInt();
        
        if (umur >= 17) {
            System.out.println("Bisa Buat SIM");
        } else {
            System.out.println("Tidak Bisa Buat SIM");
        }
    
    }
    
}
