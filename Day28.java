package day28coding;
public class Day28Coding {

    public static void main(String[] args) {

        int a = 99;
        int b = 99;
        int c = 100;

        // Membandingkan kesamaan nilai
        System.out.println("Membandingkan Persamaan ");
        System.out.println("a == b : " + (a == b)); // true  : karena nilai nya sama sama 99
        System.out.println("a == c : " + (a == c)); // false : karena 99 tidak sama dengan 100

        // Membandingkan ketidaksamaan nilai
        System.out.println("\nMembandingkan ketidaksamaan ");
        System.out.println("a != b : " + (a != b)); // false : karena nilainya sama
        System.out.println("a != c : " + (a != c)); // true  : karena nilainya berbeda
        
    }
    
}
