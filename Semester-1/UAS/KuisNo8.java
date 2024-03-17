import java.util.Scanner;
public class KuisNo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah hari dalam satu bulan: ");
        int jumlahHari = scanner.nextInt();
        int[] suhuHarian = new int[jumlahHari];
        for (int i = 0; i < jumlahHari; i++) {
            System.out.print("Masukkan suhu untuk hari ke-" + (i + 1) + ": ");
            suhuHarian[i] = scanner.nextInt();
        }

        int suhuMinimum = suhuHarian[0];
        int suhuMaksimum = suhuHarian[0];
        for (int suhu : suhuHarian) {
            if (suhu < suhuMinimum) {
                suhuMinimum = suhu;
            }

            if (suhu > suhuMaksimum) {
                suhuMaksimum = suhu;
            }
        }

        int totalSuhu = 0;
        for (int suhu : suhuHarian) {
            totalSuhu += suhu;
        }

        double suhuMinimumRataRata = (double) suhuMinimum / jumlahHari;
        double suhuMaksimumRataRata = (double) suhuMaksimum / jumlahHari;
        double suhuRataRata = (double) totalSuhu / jumlahHari;
        int hariSuhuTerendah = -1;
        int suhuTerendah = Integer.MAX_VALUE;

        for (int i = 0; i < jumlahHari - 1; i++) {
            int suhuHariBerikutnya = suhuHarian[i + 1];
            if (suhuHarian[i] < suhuTerendah && suhuHariBerikutnya < suhuTerendah ) {
                suhuTerendah = suhuHarian[i];
                hariSuhuTerendah = i + 1;
            }
        }

        int hariSuhuTertinggi = -1;
        int suhuTertinggi = Integer.MIN_VALUE;
        for (int i = 0; i < jumlahHari - 1; i++) {
            int suhuHariBerikutnya = suhuHarian[i + 1];
            if (suhuHarian[i] > suhuTertinggi && suhuHariBerikutnya > suhuTertinggi) {
                suhuTertinggi = suhuHarian[i];
                hariSuhuTertinggi = i + 1;
            }
        }

        System.out.println("\nStatistik suhu selama satu bulan: ");
        System.out.println("Suhu Minimum Rata-Rata selama satu bulan: " + suhuMinimumRataRata);
        System.out.println("Suhu Maksimum Rata-Rata selama satu bulan : " + suhuMaksimumRataRata);
        System.out.println("Suhu Rata-Rata: " + suhuRataRata);
        System.out.println("Suhu Terendah pada Bulan dan Hari : " + suhuTerendah + " (Hari ke-" + hariSuhuTerendah + ")");
        System.out.println("Suhu Tertinggi pada Bulan dan Hari : " + suhuTertinggi + " (Hari ke-" + hariSuhuTertinggi + ")");
    }
}