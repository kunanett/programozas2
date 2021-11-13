package examples.week10;

import java.util.List;
import java.util.Random;

public class RandUtils {

    /**
     * @param min - inclusive
     * @param max - inclusive
     * @return random number in [min, max] interval
     */
    public static int randint(int min, int max) {
        Random random = new Random();
        int randomNum = random.nextInt(max - min + 1);
        return randomNum + min;
    }

    /**
     * @param min - inclusive
     * @param max - exclusive
     * @return - random {@code int} in [min, max) interval
     */
    public static int randRange(int min, int max) {
        /*Random random = new Random();
        int randomNum = random.nextInt(max - min);
        return randomNum + min;*/
        return randint(min, max - 1);
    }

    /**
     * @param numbers - List of integers
     * @return - random element from {@code numbers}
     */
    public static int choice(List<Integer> numbers) {
        Random random = new Random();
        int randomIndex = random.nextInt(numbers.size());
        return numbers.get(randomIndex);
    }
}
