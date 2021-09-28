package homework.week2;

import java.util.Scanner;

public class Circle {

    private double radius;

    public Circle() {
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double circumference() {
        return 2 * radius * Math.PI;
    }

    public double area() {
        return radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isSmallerThan(Circle otherCircle){
        if (this.radius < otherCircle.getRadius()){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius of a circle: ");
        double r = input.nextDouble();
        Circle myCircle = new Circle(r);
        System.out.printf("The perimeter of the circle is %f.%n", myCircle.circumference());
        System.out.printf("The area of the circle is %f.%n", myCircle.area());*/
        Circle myCircle1 = new Circle(1);
        Circle myCircle2 = new Circle(2);
        System.out.println(myCircle1.isSmallerThan(myCircle2));

    }
}
