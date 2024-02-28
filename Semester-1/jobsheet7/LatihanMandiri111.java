import java.util.Scanner;
public class LatihanMandiri111 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int jumlah = 0;

        for (int i = 25; i >= 1; i++) {
            if (i > 0) {
                jumlah += i;
            }
        }
        System.out.println(" jumlah deret bilangan adalah " + jumlah);
    }
}