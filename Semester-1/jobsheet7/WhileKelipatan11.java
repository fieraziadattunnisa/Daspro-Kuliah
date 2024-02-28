import java.util.Scanner;
public class WhileKelipatan11 {
    public static void main(String[] args) {
        Scanner input11 =new Scanner(System.in);
        int  Kelipatan, Jumlah = 0, Counter = 0;

        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        Kelipatan = input11.nextInt();

        int i = 1;
        while (i <= 50 ) {
            if (i % Kelipatan == 0) {
                Jumlah += i;
                Counter++;
            }
            i++;
        }
        if (Counter > 0){
        double ratarata = (double) Jumlah / Counter;
        System.out.printf("Banyak bilangan %d dari 1 sampai 50 adalah %d\n", Kelipatan, Counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", Kelipatan, Jumlah);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", Kelipatan, ratarata);
        } else{
            System.out.println(" Tidak ada bilangan kelipatan yang ditemukan. ");
        }
    }
}