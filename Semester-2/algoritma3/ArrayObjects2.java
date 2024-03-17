import java.util.Scanner;
public class ArrayObjects2 {
    static class PersegiPanjang {
        
        public int panjang;
        public int lebar;
        public int panjangArray;

        public static void main(String[] args) {
            PersegiPanjang[] ppArray = new PersegiPanjang[3];
            Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" +i);
            System.out.print("Masukkan Panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}   
}