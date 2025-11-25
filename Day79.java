package day79coding; 
import java.util.Scanner;
public class Day79coding {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        String user = "taufik";
        String password = "252327";

        String namaPengguna, sandi;

        while (true) {
            System.out.print("Masukkan username : ");
            namaPengguna = l.nextLine();

            System.out.print("Masukkan password : ");
            sandi = l.nextLine();

            if (namaPengguna.equals(user) && sandi.equals(password)) {
                System.out.println("Login berhasil! Selamat datang.");
                break; 
            } else {
                System.out.println("Username atau password salah! Coba lagi.\n");
            }
        }
    }   
}
