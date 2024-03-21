import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================================================");
        System.out.println("Program menghirung keuntungan total (Satusan Juta, Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elemen = sc.nextInt();
        System.out.println("Masukkan jumlah perusahaan : ");
        int perusahaan = sc.nextInt();

        double[][] kPerusahaan = new double[perusahaan][elemen];

        System.out.println("Masukkan nilai keuntungan tiap bulan!");
        for (int i = 0; i < perusahaan; i++) {
            System.out.println("Perusahaan ke-" + (i + 1));
            for (int j = 0; j < elemen; j++) {
                System.out.print("Bulan ke-" + (j + 1) + " = ");
                kPerusahaan[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        System.out.println("  Total Keuntungan Tiap Perusahaan Selama %d Bulan ");

        for (int i = 0; i < perusahaan; i++) {
            Sum Aperusahaan = new Sum(elemen);  
            double Akeuntungan = Aperusahaan.totalBF(kPerusahaan[i]);
            System.out.printf("Perusahaan ke        : " + (i+1));
            System.out.println("Total keuntungan    : " + Akeuntungan);
            System.out.println();
        }

    }
}
