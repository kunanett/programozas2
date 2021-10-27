package zh.potZH_gyak.gyak1.feladat2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0 || args.length == 1) {
            System.out.println("Hiba");
        } else {
            String input = args[0];
            List<Character> chars = new ArrayList<>();
            for (int i = 1; i < args.length; i++) {
                chars.add(args[i].charAt(0));
            }
            System.out.println(StringUtils.doubleChars(input, chars));
        }
    }
}
