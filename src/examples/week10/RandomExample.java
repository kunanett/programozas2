package examples.week10;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
    }
}
