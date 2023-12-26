import java.util.ArrayList;
import java.util.List;

public class  kuis2 {
    public static void main(String[] args) {
        String input = "abcd";
        List<String> permutations = new ArrayList<>();
        permutasi(input, 0, input.length() - 1, permutations);
        System.out.println(permutations);
    }

    private static void permutasi(String input, int l, int r, List<String> permutations) {
        if (l == r) {
            permutations.add(input);
        } else {
            for (int i = l; i <= r; i++) {
                input = main(input, l, i);
                permutasi(input, l + 1, r, permutations);
                input = main(input, l, i);
            }
        }
    }

    private static String main(String input, int i, int j) {
        char temp;
        char[] charArray = input.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}