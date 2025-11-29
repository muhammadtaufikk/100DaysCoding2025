package day83coding;
public class Day83coding {
    public static void main(String[] args) {
        
        int[] angka = {5, 10, 15, 20, 25};

        int total = 0;

        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }

        System.out.println("Jumlah semua elemen array adalah: " + total);
    }
}
