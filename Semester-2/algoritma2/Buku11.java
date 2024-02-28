

public class Buku11 {
        
        String judul, pengarang;
        int halaman, stok, harga, terjual = 0, totalharga = 0, diskon = 0, hargaBayar = 0;

        public Buku11() {

        }

        public Buku11(String jud, String pg, int hal, int stok, int har) {
            judul = jud;
            pengarang = pg;
            halaman = hal;
            this.stok = stok;
            harga = har;
        }


        void tampilinformasi() {
            System.out.println(" Judul: " + judul);
            System.out.println("Pengarang: " + pengarang);
            System.out.println("Jumlah halaman: " + halaman);
            System.out.println("Sisa stok: " + stok);
            System.out.println("Harga: " + harga);
        }

        void  terjual(int jml) {
            if (terjual >= 0) {
            terjual += jml;
            stok -= jml;
    
            } else {
                System.out.println("Maaf, stok habis.");
            }
        }

        void restock(int jml) {
            stok += jml;
        }

        void gantiHarga(int hrg) {
            harga = hrg;
        }

        int hitungHarga(int jml) {
            totalharga = harga * terjual;
            return totalharga;
        }

        int hitungDiskon() {
            if (harga > 150000) {
               diskon = totalharga * (2/100);
               return 15;
            } else if (harga > 75000) {
                diskon = totalharga * (5/100);
                return 5;
            } else {
                diskon = 0;
                return 0;
            }
        }

        int hitungHargaBayar() {
            hargaBayar = totalharga - diskon;
            return hargaBayar;
        }

        public double hitungHarga() {
            return harga * stok;
        }
        
        
    }

