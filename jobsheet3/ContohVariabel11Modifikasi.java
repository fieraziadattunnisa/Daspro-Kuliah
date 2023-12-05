public class ContohVariabel11 {
    public static void main(String[] args) {
        String Hobi = "Berenang";
        boolean isPandai = true;
        char jenisKelamin = 'P';
        byte _umurSayaSekarang = 18;
        double $ipk = 3.24, tinggi = 1.78;

        System.out.println("Salah satu hobi saya ialah " + Hobi);
        System.out.println("Apakah pandai? " + isPandai + " pandai");
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + _umurSayaSekarang + " tahun");
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s m", $ipk, tinggi));
    }
}