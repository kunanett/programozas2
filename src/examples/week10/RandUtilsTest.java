package examples.week10;

import java.util.List;

public class RandUtilsTest {
    public void testRandint() {
        //Given - RandUtils class randint method
        //When
        for (int i = 0; i < 100; i++) {
            int result = RandUtils.randint(5, 10);
            //Then
            assert result >= 5 && result <= 10;
        }
    }

    public void testRandRange() {
        //Given - RandUtils class randrange method
        //When
        for (int i = 0; i < 100; i++) {
            int result = RandUtils.randRange(5, 10);
            //Then
            assert result >= 5 && result < 10;
        }
    }

    public void testChoice() {
        //Given - RandUtils choice
        List<Integer> numbers = List.of(10, 11, 12, 13, 14);
        //When
        for (int i = 0; i < 100; i++) {
            int result = RandUtils.choice(numbers);
            //Then
            assert numbers.contains(result);
        }
    }

    public void runTests() {
        testRandint();
        testRandRange();
        testChoice();
    }

    public static void main(String[] args) {
        RandUtilsTest test = new RandUtilsTest();
        test.runTests();
    }
}
