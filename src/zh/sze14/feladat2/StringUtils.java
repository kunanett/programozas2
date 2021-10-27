package zh.sze14.feladat2;

public class StringUtils {
    public static int[] countVowelsAndConsonants(String input) {
        int[] result = new int[2];
        String vowels = "aáeéiíuúüűöőoó";
        String consonants = "bcdfghjklmnpqrstvwxyz";
        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : input.toLowerCase().toCharArray()) {
            if (vowels.contains(String.valueOf(c))) {
                vowelCount++;
            } else if (consonants.contains(String.valueOf(c))) {
                consonantCount++;
            }
        }
        result[0] = vowelCount;
        result[1] = consonantCount;
        return result;
    }
}
