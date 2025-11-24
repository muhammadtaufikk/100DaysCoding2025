package day78coding;
import java.util.Scanner;
public class day78coding {
    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = l.nextLine();

        System.out.println("\n=== HASIL ===");
        System.out.println("Length      : " + teks.length());
        System.out.println("Uppercase   : " + teks.toUpperCase());
        System.out.println("Lowercase   : " + teks.toLowerCase());
        System.out.println("Trim        : " + teks.trim());
        System.out.println("Replace a→o : " + teks.replace("a", "o"));
        System.out.println("Contains 'a': " + teks.contains("a"));
        System.out.println("StartsWith 'a': " + teks.startsWith("a"));
        System.out.println("EndsWith 'a'  : " + teks.endsWith("a"));

    }
}
