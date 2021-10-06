package examples.week5;

public class CharacterExample {

    public static int getSum(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                sum += digit;
            }else{
                throw new UnsupportedOperationException("Nem számot adott meg");
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSum("999999992hgg864620123"));
    }
}
