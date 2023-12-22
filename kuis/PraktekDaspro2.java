import java.util.Scanner;
public class PraktekDaspro2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tpa, bing, nasionalisme, ipk,ratarata;
        String kesehatan;

        System.out.println("Tahap seleksi tes!");
        System.out.println("Masukkan nilai tes potensi akademik: ");
        tpa = input.nextDouble();
        System.out.println("Masukkan nilai tes bahasa inggris: ");
        bing = input.nextDouble();
        System.out.println("Masukkan nilai nasionalisme: ");
        nasionalisme = input.nextDouble();

        ratarata = (tpa + bing + nasionalisme) /3;
        System.out.println("Nilai ratarata: " + ratarata);

        if (ratarata >= 78 && (tpa >= 75 && bing >= 75 && nasionalisme >= 75)) {
            System.out.println("Anda Lolos Tahap Seleksi Tes!");

            System.out.println("Tahap Seleksi Kelengkapan Kesesuaian Berkas!");
            System.out.print("Masukkan nilai IPK: ");
            ipk = input.nextDouble();
            input.nextLine();
            System.out.print("Apakah anda dinyatakan Sehat Jasmani dan Rohani oleh Surat Keterangan dari Dokter?(y/n): ");
            kesehatan = input.nextLine();

            if (ipk >= 3.25 && kesehatan.equalsIgnoreCase("y")) {
                System.out.println("Anda Lolos Tahap Seleksi Kelengkapan Kesesuaian Berkas!");
                System.out.println("Anda Lolos hingga Tahap Akhir!");
            } else {
                System.out.println("Anda Tidak Lolos Tahap Seleksi Kelengkapan Kesesuaian Berkas!");
                System.out.println("Anda Tidak Lolos hingga Tahap Akhir!");
            }
        } else {
            System.out.println("Anda tidak Lolos ke Tahap Selanjutnya!");
        }
    }
}