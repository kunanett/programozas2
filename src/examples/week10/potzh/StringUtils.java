package examples.week10.potzh;

import java.util.Arrays;

public class StringUtils {
    public static int[] stat(String input) {
        int[] result = new int[3];
        String vowels = "aáeéiíuúüűöőoó";
        String consonants = "bcdfghjklmnpqrstvwxyz";
        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;

        for (char c : input.toLowerCase().toCharArray()) {
            if (vowels.contains(String.valueOf(c))) {
                vowelCount++;
            } else if (consonants.contains(String.valueOf(c))) {
                consonantCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        result[0] = vowelCount;
        result[1] = consonantCount;
        result[2] = digitCount;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(stat("aeibcd123")));
    }
}