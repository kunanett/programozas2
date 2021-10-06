package examples.week5;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Szám1: ");
        int num1 = Integer.parseInt(sc.next());
        System.out.print("Szám2: ");
        int num2 = Integer.parseInt(sc.next());
        int result = num1 + num2;
        System.out.println("Összeg: " + result);
        String s = "c";

        int i = 5;
        double d = i;

    }
}
