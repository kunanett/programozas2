package homework.week4;

import java.util.ArrayList;
import java.util.List;

public class PyUtils {
    public static List<Integer> range(int end) {
        return range(0, end);
    }

    private static List<Integer> range(int start, int end) {
        return range(start, end, 1);
    }

    private static List<Integer> range(int start, int end, int step) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i < end; i += step) {
            result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(PyUtils.range(5));
        System.out.println(PyUtils.range(2, 7));
        System.out.println(PyUtils.range(4, 20, 2));
    }
}
