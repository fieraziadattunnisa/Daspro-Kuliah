import java.util.Scanner;
public class Tugas1 {
    static void deretDescendingRekursif(int n){
        if (n >= 0 ) {
            System.out.print(n + " ");
            deretDescendingRekursif(n -1 );
        }
    }

    static void deretDescendingIteratif(int n ) {
        for (int i =n ; i>= 0; i--) {
            System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;

        System.out.print(" Masukkan angka : ");
        angka= sc.nextInt();

        System.out.println(" Deret Descending dengan Iteratif: ");
        deretDescendingIteratif(angka);
        System.out.println();

        System.out.println(" Deret Descending dengan Rekursif: ");
        deretDescendingRekursif(angka);
        System.out.println();
    }
}