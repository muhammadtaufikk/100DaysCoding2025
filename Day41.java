package evaluasi18okt;
import java.util.Scanner;
public class Evaluasi18Okt {
    public static void main(String[] args) {
        Scanner l = new Scanner (System.in);
        
        System.out.println("=== Evaluasi Mentor ===");
        System.out.print("masukkan nilai teori   = ");
        int teori = l.nextInt();
        System.out.print("masukkan nilai praktik = ");
        int praktik = l.nextInt();
        System.out.println("=========================");
        
        if (teori >= 90 && teori <= 100 && praktik >= 90 && praktik <= 100) {
            System.out.println("Predikat   = A");
            System.out.println("Keterangan = Lulus dengan Predikat yang Sangat Baik");
        }else if (teori >= 80 && teori <= 100 && praktik >= 75 && praktik <= 100){
            System.out.println("Predikat   = B");
            System.out.println("Keterangan = Lulus dengan Predikat Baik");
        }else if (teori >= 70 && teori <= 100 && praktik >= 70 && praktik <= 100){
            System.out.println("Predikat   = C");
            System.out.println("Keterangan = Lulus dengan Predikat Cukup");
        }else if (teori <= 70 && praktik >=0){
            System.out.println("Predikat   = D");
            System.out.println("Keterangan = Tidak Lulus");
        }else{
            System.out.println("Nilai tidak valid! Harus antara 0 - 100");
        }
      
    }
    
}
