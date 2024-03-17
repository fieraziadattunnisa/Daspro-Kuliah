public class Tugas1 {
    static String judul;
    String pengarang;
    int halaman, stok = 0, harga, diskon = 0, hargatotal = 0, hargadiskon = 0, hargabayar = 0;

public static void main(String[] args) {
    Tugas1 buku = new Tugas1("Laskar Pelangi", "Andrea Hirata", 200, 10, 50000);

        System.out.println("Judul: " + buku.judul);
        System.out.println("Pengarang: " + buku.pengarang);
        System.out.println("Jumlah Halaman: " + buku.halaman);
        System.out.println("Sisa Stok: " + buku.stok);
        System.out.println("Harga: " + buku.harga);
        System.out.println("Diskon: " + buku.hitungDiskon(4));
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        } else {
            System.out.println("Mohon maaf stok habis.");
        }
    }

    void restock(int n) {
        stok += n;
    }

    int hitungHargaTotal(int jml) {
        hargatotal = harga * stok;
        return hargatotal;
    }

    int hitungDiskon(int jml) {
        int hargadiskon = 0;
        int hargatotal = hitungHargaTotal(jml);
        if (hargatotal >= 150000) {
            hargadiskon = (int) (0.12*hargatotal);
        } else if (hargatotal >= 75000 && hargatotal <= 150000) {
            hargadiskon = hargatotal * (5/100);
        } else {
            hargadiskon = 0;
        }
        return hargadiskon;
    }

    int hitungHargaBayar(int jml) {
        hargabayar = hargatotal - hargadiskon;
        return hargabayar; 
    }

    public Tugas1() {

    }

    public Tugas1(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;

    }
}

