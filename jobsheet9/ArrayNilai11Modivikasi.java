import java.util.Scanner;
public class ArrayNilai11Modivikasi {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan Nilai Akhir ke-" +i+ " : ");
            nilaiAkhir[i] = input11.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai Akhir ke-" +i+ " adalah " + nilaiAkhir[i]);
        }
    }
}