import java.util.Scanner;
public class Percobaan2Modif {
    static int hitungpangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            System.out.print(x +  "x" );
            int hasil = x * hitungpangkat(x, y-1);
            if (y == 1) {
                System.out.print("1");
            }
            return hasil;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;
        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("pangkat: ");
        pangkat = sc.nextInt();

        System.out.println("Hasil Perhitungan: ");
        int hasil = hitungpangkat(bilangan, pangkat);
        System.out.println(" = " + hasil);
    }
}
