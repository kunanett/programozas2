package examples.week10.potzh;

public class MyMath {
    public static boolean isArmstrong(int number) {
        int temp = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number = number / 10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(371));
        System.out.println(isArmstrong(372));
    }
}
