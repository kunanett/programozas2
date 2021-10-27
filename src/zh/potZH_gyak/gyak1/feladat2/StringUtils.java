package zh.potZH_gyak.gyak1.feladat2;

import java.util.List;

public class StringUtils {

    public static String doubleChars(String input, List<Character> chars){
        StringBuilder result = new StringBuilder();
        for (char c: input.toCharArray()){
            if (chars.contains(c)){
                result.append(c);
            }
            result.append(c);
        }
        return result.toString();
    }
}
