import java.util.Scanner;
public class Gaji11 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, TotGaji, besGaji, potGaji;
        System.out.print("Masukkan Besaran Gaji ");
        besGaji=input.nextInt();
        System.out.print("Masukkan Potongan Gaji ");
        potGaji=input.nextInt();
        System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        JmlTdkMasuk=input.nextInt();
        TotGaji=(jmlMasuk*besGaji)-(JmlTdkMasuk*potGaji);
        System.out.print("Gaji yang anda terima adalah " +TotGaji);
    }
}