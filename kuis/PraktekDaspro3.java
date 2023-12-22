import java.util.Scanner;
public class PraktekDaspro3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tpa, bing, nasionalisme, ipk;
        String berkas;

        System.out.println("masukkan jumlah pendaftar:");
        double jmlhpendaftar = input.nextDouble();

        for(int i=1; i <= jmlhpendaftar; i++) {
            System.out.println("Masukkan nilai kelengkapan pendaftar ke-" + i + ":");
            System.out.println("Masukkan nilai potensi akademik: ");
            tpa = input.nextDouble();
            System.out.println("Masukkan nilai bahasa inggris: ");
            bing = input.nextDouble();
            System.out.println("Masukkan nilai nasionalisme: ");
            nasionalisme = input.nextDouble();
            System.out.println("Masukkan nilai ipk: ");
            ipk = input.nextDouble();
            System.out.println("apakah kelengkapan karyawan sudah lengkap : (ya/tidak)");
            berkas = input.next();
            System.out.println("apakah peserta membawa surat keterangan sehat jasmani dan sehat rohani? (ya/tidak)");
            String surat_keterangan = input.next();
            double ratarata= (tpa + bing + nasionalisme)/3;
            System.out.println("rata rata nilai karyawan baru adalah :" + ratarata);

            if (ratarata >= 78 && tpa >= 75 && bing >= 75 && nasionalisme >= 75 && ipk >= 3.25 && berkas.equalsIgnoreCase("ya") && surat_keterangan.equalsIgnoreCase("ya")) {
                System.out.println("Selamat, Anda lolos hingga tahap akhir!");
            } else {
                System.out.println("Maaf, Anda tidak lolos .");
            }
        }
    }
}