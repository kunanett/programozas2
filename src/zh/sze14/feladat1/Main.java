package zh.sze14.feladat1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Food pizza = new Food("pizza", 10);
        Food fries = new Food("fries", 3);
        /*Order order = new Order();
        order.addFood(fries);
        order.addFood(fries);
        order.addFood(pizza, 3);
        order.printOrder();
        System.out.printf("Total price: %d$%n", order.calculateTotalPrice());*/

        Map<Food, List<String>> map = new HashMap<>();
        List<String> friesIngredients = new ArrayList<>();
        friesIngredients.add("krumpli");
        friesIngredients.add("olaj");
        friesIngredients.add("só");
        map.put(pizza, List.of("liszt", "olaj", "élesztő", "sajt", "paradicsom"));
        map.put(fries, friesIngredients);

    }
}
