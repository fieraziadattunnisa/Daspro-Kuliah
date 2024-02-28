import java.util.Scanner;
public class BioskopWithScanner11 {
    public static void main(String[] args) {
    Scanner input11 = new Scanner(System.in);

    String[][] penonton = new String[4][2];
    String nama;
    int baris, kolom;
    String next;

    while (true) {
        System.out.print("Masukkan nama: ");
        nama = input11.nextLine();
        System.out.print("Masukkan baris: ");
        baris = input11.nextInt();
        System.out.print("Masukkan kolom: ");
        kolom = input11.nextInt();
        input11.nextLine();

        penonton[baris-1][kolom-1] = nama;

        System.out.print("Input penonton lainnya? (y/n): ");
        next = input11.nextLine();

        if (next.equalsIgnoreCase("n")) {
            break;
            }
        }
    }
}
