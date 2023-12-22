import java.util.Scanner;
public class PraktekDaspro1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai tes potensi akademik: ");
        double tpa = input.nextDouble();
        System.out.println("Masukkan nilai tes bahasa inggris: ");
        double bing = input.nextDouble();
        System.out.println("Masukkan nilai tes nasionalisme: ");
        double nasionalisme = input.nextDouble();

        if (tpa < 0 || tpa > 100 || bing < 0 || bing > 100 || nasionalisme < 0 || nasionalisme > 100) {
            System.out.println("Error: Salah memasukkan nilai!");
        } else {
            double nilai_akhir = (tpa + bing + nasionalisme) /3;
            System.out.println("Nilai akhir Mahasiswa/i tersebut adalah " + nilai_akhir);
        }
    }
}