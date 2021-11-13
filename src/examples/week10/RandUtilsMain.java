package examples.week10;

import java.util.List;

public class RandUtilsMain {
    public static void main(String[] args) {
        /*System.out.println(RandUtils.randint(6, 10));
        System.out.println(RandUtils.randRange(5, 1));*/
        List<Integer> numbers = List.of(10, 11, 56, 13, 14);
        System.out.println(RandUtils.choice(numbers));
    }
}
