package pkgday20coding;

public class Main {

    public static void main(String[] args) {
        //menggunakan metode value of:
        short nilai =1000; 
        String teks = String.valueOf(nilai);
        System.out.println(teks);
        
        //menggunakan metode .toString:
        int angkaInt = 12345;
        String konversi = Integer.toString(angkaInt);
        System.out.println(konversi);
                
        //menggunakan metode operator:
        long angka = 999999;
        String output = angka + "";
        System.out.println(output);
                
        }
    
}
