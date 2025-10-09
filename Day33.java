package day33coding;
import java.util.Scanner;
public class Day33coding {
    public static void main(String[] args) {
        Scanner l = new Scanner (System.in);

        System.out.print("Cuaca Hujan = ");
        boolean hujan = l.nextBoolean();

        if (!hujan){
            System.out.println("\nGas Keluar Rumah");
        }else{
            System.out.println("\nAnda Harus Menggunakan Jas Hujan");
        }
        
    }
}
