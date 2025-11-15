package day69coding;
import java.util.Scanner;
public class Day69coding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int percobaan = 0;

        while (percobaan < 3) {
            System.out.print("Username: ");
            String user = sc.nextLine();
            
            System.out.print("Password: ");
            String pass = sc.nextLine();

            if (user.equals("admin") && pass.equals("12345")) {
                System.out.println("Login berhasil! Selamat datang.");
                return; // langsung keluar dari program
            } else {
                System.out.println("Login gagal! Coba lagi.");
                percobaan++;
            }
        }

        System.out.println("Akses ditolak!");
    }
}
