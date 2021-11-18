package zh.sze14.feladat1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zh.sze12.feladat1.Product;

public class Order {

    private final List<Food> foods = new ArrayList<>();

    public List<Food> getFoods() {
        return foods;
    }

    //beletesz egy ételt a kosárba
    public void addFood(Food food) {
        foods.add(food);
    }

    //adott foodból numberOf mennyiséget tesz a kosárba
    //kiír egy összegzést a rendelés tartalmáról
    //kiszámolja, hogy mennyi a teljes ár
    public int calculateTotalPrice() {
        int totalPrice = 0;
        for (Food food : foods) {
            totalPrice += food.getPrice();
        }
        return totalPrice;
    }

    public void addFood(Food food, int numberOf) {
        for (int i = 0; i < numberOf; i++) {
            addFood(food);
        }
    }

    //a Food objektumok összehasonlításához elegendő a name adattagot vizsgálni
    public void printOrder() {
        /*String[] foodNames = new String[foods.size()];
        int[] foodNumber = new int[foodNames.length];

        int index = 0;
        for (Food currentFood : foods) {
            int i = 0;
            boolean foundFood = false;
            while (i <= index && !foundFood) {
                if (currentFood.getName().equals(foodNames[i])) {
                    foodNumber[i]++;
                    foundFood = true;
                }
                i++;
            }
            if (!foundFood) {
                foodNames[index] = currentFood.getName();
                foodNumber[index] = 1;
                index++;
            }
        }

        System.out.println("Order contents:");
        for (int i = 0; i < index; i++) {
            System.out.printf("%s: %d%n", foodNames[i], foodNumber[i]);
        }*/
        Map<Food, Integer> stat = new HashMap<>();
        for (Food food : foods) {
            if (stat.containsKey(food)) {
                stat.replace(food, stat.get(food) + 1);
            } else {
                stat.put(food, 1);
            }
        }

        for (Map.Entry<Food, Integer> entry : stat.entrySet()) {
            System.out.println(entry.getKey().getName() + ": " + entry.getValue());
        }
    }
}
