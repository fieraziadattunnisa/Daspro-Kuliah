public class ArrayBalok {
    static class Balok{
        public int panjang;
        public int lebar;
        public int tinggi;

        public Balok(int p, int l, int t) {
            panjang = p;
            lebar = l;
            tinggi = t;
        }

        public int hitungVolume() {
            return panjang * lebar * tinggi;
        }

        public static void main(String[] args) {
            
        }
    }
}
