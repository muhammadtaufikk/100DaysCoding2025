package pkgday21coding;
public class Main {
    public static void main(String[] args) {
                
        //Variabel sementara
        int a = 1;
        int b = 2;

        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //Menukar menggunakan variabel sementara
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nSetelah ditukar (dengan temp):");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

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
