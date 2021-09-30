package homework.week3;

import java.util.Arrays;

public class MyArrayUtils {
    public static boolean equals(int[] array1, int[] array2) {
        boolean isEqual = true;
        if (array1.length != array2.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < array1.length && isEqual; i++) {
                if (array1[i] != array2[i]) {
                    isEqual = false;
                }
            }
        }
        return isEqual;
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    public static int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }

    public static int[] sortDescending(int[] array) {
        return reverse(sort(array));
    }

    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 4, 2, 5, 3};
        int[] array2 = {5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(MyArrayUtils.reverse(array1)));
        System.out.println(Arrays.toString(MyArrayUtils.sort(array1)));
        System.out.println(Arrays.toString(MyArrayUtils.sortDescending(array1)));
        System.out.println(MyArrayUtils.equals(array1, array2));
        System.out.println(MyArrayUtils.min(array1));

    }
}
