package zh.sze12.feladat3;

import java.util.Arrays;

public class Triangles {
    public static boolean checkRightTriangle(int a, int b, int c) {
        int[] sides = {a, b, c};
        boolean result = false;
        Arrays.sort(sides);
        if (sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2] &&
                sides[0] > 0 && sides[1] > 0 && sides[2] > 0) {
            result = true;
        }
        return result;
    }
}
