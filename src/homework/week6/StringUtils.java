package homework.week6;

public class StringUtils {
    public static String randomCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Math.random() < 0.5) {
                result.append(String.valueOf(c).toLowerCase());
            } else {
                result.append(String.valueOf(c).toUpperCase());
            }
        }
        return result.toString();
    }
}
