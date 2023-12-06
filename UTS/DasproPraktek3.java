import java.util.Scanner;
public class DasproPraktek3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        byte jumlah_mahasiswa = input.nextByte();
        int i = 1;
        while (i <= jumlah_mahasiswa) {
            System.out.print("Masukkan nilai Matematika (0 - 100): ");
            double Matematika = input.nextDouble();
            System.out.print("Masukkan nilai Fisika (0 - 100): ");
            double Fisika = input.nextDouble();
            System.out.print("Masukkan nilai Bing (0 - 100): ");
            double Bing = input.nextDouble();
            System.out.print("Masukkan nilai Bin (0 - 100): ");
            double Bin = input.nextDouble();

            if (Matematika < 0 || Matematika > 100 || Fisika < 0 || Fisika > 100 || Bing < 0 || Bing > 100 ||  Bin < 0 || Bin > 100) {
                System.out.println("Error: Salah memasukkan nilai!");
            } else {
                double nilai_akhir = (Matematika + Fisika + Bing + Bin) / 3;
                System.out.println("Nilai akhir mahasiswa/i ke-" + i++ + " adalah " + nilai_akhir + ".\n");
            }
        } i++;
    }
}