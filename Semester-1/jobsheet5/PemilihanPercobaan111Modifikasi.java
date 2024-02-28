import java.util.Scanner;
public class PemilihanPercobaan111 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = input11.nextInt();
        String hasil= (angka % 2 ==0) ? "genap" : "ganjil";
        System.out.println("bilangan " + angka + " adalah bilangan " + hasil);
    }
}