package examples.week4;

public class Exercise1 {
    /**
     * Adott egy 10 elemű tömb, töltsük fel számokkal.
     * Egy függvénnyel adjuk vissza a legkisebb és a legnagyobb elemét.
     */

    public static int[] minMax(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] result = new int[2];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        result[0] = min;
        result[1] = max;
        return result;
    }

    public static MinMax otherMinMax(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        return new MinMax(min, max);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = minMax(array);
        System.out.printf("min: %d %nmax: %d", result[0], result[1]);
        MinMax otherResult = otherMinMax(array);
        System.out.println();
        System.out.printf("min: %d %nmax: %d", otherResult.getMin(), otherResult.getMax());
    }
}
