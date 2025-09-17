package challenge;

public class Challenge {

    public static void main(String[] args) {
        //final variabel adalah sebuah nilai yang tidak bisa diubah
        
        //contoh 1:
        int nilai1 = 99;
        nilai1 = 88;
        
        System.out.println("dicontoh pertama jika kita belum menambahkan kata final di integer\nmaka nilai yang muncul masih bisa di update dan ini \nhasilnya : " + nilai1);
        
        //contoh 2:
        
        final int nilai2 = 100;
        System.out.println("\ndicontoh ke dua ini angka final nya adalah 100\njadi jika kita ingin mengupdate\nnilai tersebut maka akan terjadi eror\nhasilnya akan tetap : " + nilai2);
        
    }
    
}
