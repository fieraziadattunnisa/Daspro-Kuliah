import java.util.Scanner;

public class ArrayPersegiPanjang {
    static class PersegiPanjang {
        public int panjang;
        public int lebar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris array: ");
        int numRows = sc.nextInt();
        System.out.print("Masukkan jumlah kolom array: ");
        int numCols = sc.nextInt();

        PersegiPanjang[][] ppArray2D = new PersegiPanjang[numRows][numCols];

        // Menginisialisasi objek-objek PersegiPanjang
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                ppArray2D[i][j] = new PersegiPanjang();
                System.out.println("Masukkan panjang dan lebar untuk persegi panjang ke-" + i + "," + j);
                System.out.print("Panjang: ");
                ppArray2D[i][j].panjang = sc.nextInt();
                System.out.print("Lebar: ");
                ppArray2D[i][j].lebar = sc.nextInt();
            }
        }

        // Mencetak objek-objek PersegiPanjang
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.println("Persegi Panjang ke-" + i + "," + j);
                System.out.println("Panjang: " + ppArray2D[i][j].panjang + ", lebar: " + ppArray2D[i][j].lebar);
            }
        }

        sc.close(); // Menutup scanner setelah selesai digunakan
    }
}
