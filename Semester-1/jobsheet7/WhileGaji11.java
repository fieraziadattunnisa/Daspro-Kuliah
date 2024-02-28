import java.util.Scanner;
public class WhileGaji11 {
    public static void main(String[] args) {
        Scanner input11 =new Scanner(System.in);

        int JumlahKaryawan, JumlahJamLembur;
        double GajiLembur = 0, TotalGajiLembur = 0;
        String Jabatan;

        System.out.print("Masukkan jumlah karyawan: ");
        JumlahKaryawan = input11.nextInt();

        int i = 0;
        while (i < JumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.println("Masukkan jabatan karyawan ke-" + (i+1) + " : ");
            Jabatan = input11.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            JumlahJamLembur = input11.nextInt();
            i++;

            if (Jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (Jabatan.equalsIgnoreCase("Manajer")) {
                GajiLembur = JumlahJamLembur + 100000;
            } 
            else if (Jabatan.equalsIgnoreCase("Karyawan")) {
                GajiLembur = JumlahJamLembur + 75000;
            }

            TotalGajiLembur += GajiLembur;
            System.out.println(" Total gaji lembur: " + TotalGajiLembur);
        }
    }
}