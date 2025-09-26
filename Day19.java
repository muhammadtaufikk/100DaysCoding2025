package pkgday19coding;
public class Main {

    public static void main(String[] args) {
        
        long nilaiLong = 10000000000L; //ini adalah angka 10Milyar
        int nilaiInteger = (int) nilaiLong;
        
        System.out.println("Long - Int :");
        System.out.println("Nilai Long = " + nilaiLong);
        System.out.println("Nilai Integer = " + nilaiInteger);
        System.out.println("\ncatatan penting : \nkarena nilai terlalu besar (overflow), maka nilai\nyang muncul tidak akan sesuai dengan harapan");
        
        double nilaiDouble = 12345.6789;
        float nilaiFloat = (float) nilaiDouble;
        
        System.out.println("\nDouble - Float :");
        System.out.println("Nilai Double = " + nilaiDouble);
        System.out.println("Nilai Float = " + nilaiFloat);
        System.out.println("\ncatatan penting : \ndisini angka 8 tdk ada, Hilangnya angka (seperti 8)\nsaat konversi double ke float bukan error,\ntapi konsekuensi dari keterbatasan presisi\nmksdnya float hanya bisa menampung 7 digit.");
        
        System.out.println("\nDouble - Int :");
        System.out.println("Double = 12345.6789 (bilangan desimal)\njika dikonversikan ke Integer maka hasilnya adalah\nInteger = 12345 (bilangan bulat)\nkarena angka yang berada di belakang koma dihilangkan");
        
    }
    
}
