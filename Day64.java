package day64coding;
public class Day64coding {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil *= m;
        }

        System.out.println(m + " pangkat " + n + " adalah " + hasil);
    }
}
