import java.util.Scanner;
public class Tugas4 {
    static int HitungPasangMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;
        } else {
            return HitungPasangMarmut(bulan - 1) + HitungPasangMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan ke: ");
        int bulan = sc.nextInt();
        int JumlahPangan = HitungPasangMarmut(bulan);

        System.out.println("Pada bulan ke- " + bulan + ", jumlah pasang marmut adalah: " + JumlahPangan);
    }
}
