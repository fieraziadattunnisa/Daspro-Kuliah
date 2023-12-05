import java.util.Scanner;
public class LatihanMandiri211 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        int JumlahMahasiswa= 30, JumlahPerempuan= 0;
        char JenisKelamin;
        String Nama;

        System.out.println(" Masukkan Nama dan Jenis Kelamin Mahasiswa");
        while (JumlahPerempuan < JumlahMahasiswa) {
            System.out.print("Nama Mahasiswa: ");
            Nama = input11.nextLine();

            System.out.print(" Jenis Kelamin (L/P): ");
            JenisKelamin= input11.nextLine().charAt(0);

            if (JenisKelamin == 'P' || JenisKelamin == 'P') {
                System.out.println(" Mahasiswa Perempuan: " + Nama);
                JumlahPerempuan++;
            }
        }
    }
}