import java.util.Scanner;

public class PemilihanPercobaan211 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Nilai uas \t: "); 
        float uas = input11.nextFloat();
        System.out.print("Nilai uts \t: ");
        float uts = input11.nextFloat();
        System.out.print("Nilai kuis \t: ");
        float kuis = input11.nextFloat();
        System.out.print("Nilai tugas \t: ");
        float tugas = input11.nextFloat();
        float total = (uas * 0.4F) + (kuis * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        if (total > 80){
            System.out.println("Angka " + total + " Adalah" + " A");
        }else if (total > 73){
            System.out.println("Angka " + total + " Adalah" + " B+");
        }else if (total > 65){
            System.out.println("Angka " + total + " Adalah" + " B");
        }else if (total > 60){
            System.out.println("Angka " + total + " Adalah" + " c+");
        }else if (total > 50){
            System.out.println("Angka " + total + " Adalah" + " C");
        }else if (total > 39){
            System.out.println("Angka " + total + " Adalah" + " D");
        }else if (total < 39){
            System.out.println("Angka " + total + " Adalah" + " E");
        }
    }
}