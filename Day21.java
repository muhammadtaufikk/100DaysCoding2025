package pkgday21coding;
public class Main {
    public static void main(String[] args) {
                
        // Contoh tanpa variabel sementara
        int x = 7;
        int y = 8;

        System.out.println("\nSebelum ditukar:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Menukar tanpa variabel sementara (menggunakan operasi aritmatika)
        x = x + y; // nilai x sekarang 15
        y = x - y; // nilai y sekarang 7
        x = x - y; // nilai x sekarang 8

        System.out.println("\nSetelah ditukar (tanpa temp):");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    
        
    }
    
}
