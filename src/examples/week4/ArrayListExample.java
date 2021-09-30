package examples.week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(1, 2, 3, 5, 4));
        System.out.println(numbers);
        System.out.println("Size: " + numbers.size());
        System.out.println(("is empty: " + numbers.isEmpty()));
        Collections.sort(numbers);
        System.out.println(numbers);

        for (int element : numbers) {
            System.out.println(element);
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
