package day50coding;
import java.util.Scanner;
public class Day50coding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        String hasil = angka %2==0? "GENAP" : "GANJIL";
        System.out.println(hasil);

    }
}
