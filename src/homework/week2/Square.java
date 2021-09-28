package homework.week2;

import java.util.Scanner;

public class Square {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int perimeter() {
        return 4 * side;
    }

    public int area() {
        return side * side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the side of a square: ");
        int side = input.nextInt();
        Square mySquare = new Square(side);
        System.out.printf("The perimeter of the square is %d.%n", mySquare.perimeter());
        System.out.printf("The area of the square is %d.%n", mySquare.area());

    }
}

