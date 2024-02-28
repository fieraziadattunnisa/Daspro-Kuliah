import java.util.Scanner;

public class ForKelipatan11Modivikasi1 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        int Kelipatan, Jumlah = 0, Counter = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        Kelipatan = input11.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % Kelipatan == 0) {
                Jumlah += i;
                Counter++;
            }
        }
        
        double ratarata = (double) Jumlah / Counter;
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", Kelipatan, Counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", Kelipatan, Jumlah);
        System.out.printf("ratarata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", Kelipatan, ratarata);
    }
}