package zh.sze14.feladat3;

public class Triangles {
    public static boolean checkAngles(int a, int b, int c) {
        boolean result = false;
        if (a > 0 && b > 0 && c > 0 && a < 180 && b < 180 && c < 180 &&
                a + b + c == 180) {
            result = true;
        }
        return result;
    }
}
