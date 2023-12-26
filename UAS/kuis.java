import java.util.Scanner;
public class kuis {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 

       System.out.print("Masukkan Bilangan Desimal : ");
        int num = sc.nextInt();

        System.out.print("Masukkan opsi konversi (b untuk biner, o untuk oktal, h untuk heksadesimal): ");
        char opsi = sc.next().charAt(0);

        switch (opsi) {
            case 'b':
                System.out.println("Biner: " + num + " adalah " + Integer.toBinaryString(num));
                break;
            case 'o':
                System.out.println("Oktal: " + num + " adalah " + Integer.toOctalString(num));
                break;
            case 'h':
                System.out.println("Hexadesimal: " + num + " adalah " + Integer.toHexString(num));
                break;
            default:
                System.out.println("opsi tidak valid.");
        }
    }
}
