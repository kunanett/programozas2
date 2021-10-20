package zh.sze12.feladat3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy számot: ");
        int a = input.nextInt();
        System.out.print("Kérem adjon meg egy számot: ");
        int b = input.nextInt();
        System.out.print("Kérem adjon meg egy számot: ");
        int c = input.nextInt();
        if (Triangles.checkRightTriangle(a, b, c)){
            System.out.println("A három oldal derékszögű háromszöget alkot");
        }else{
            System.out.println("A három oldal nem alkot derékszögű háromszöget");
        }
    }
}
