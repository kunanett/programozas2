package zh.sze14.feladat1;

public class Main {
    public static void main(String[] args) {

        Food food1 = new Food("pizza", 10);
        Food food2 = new Food("fries", 3);
        Order order = new Order();
        order.addFood(food2);
        order.addFood(food2);
        order.addFood(food1, 3);
        order.printOrder();
        System.out.printf("Total price: %d$%n", order.calculateTotalPrice());
    }
}
