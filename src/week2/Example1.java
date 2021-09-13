package week2;

public class Example1 {
    public static void main(String[] args) {
        String myString = "This is a string literal";
        String myOtherString = "This is a string literal";

        System.out.println("Equality test using == operator:");
        if (myString == myOtherString) {
            System.out.println("The two strings are equal");
        } else {
            System.out.println("Try again");
        }

        System.out.println("-".repeat(40));
        System.out.println("Equality test using equals method:");
        if (myString.equals(myOtherString)) {
            System.out.println("The two strings are equal");
        } else {
            System.out.println("Try again");
        }

    }
}
