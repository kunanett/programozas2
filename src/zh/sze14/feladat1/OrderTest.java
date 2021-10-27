package zh.sze14.feladat1;

import java.util.List;

public class OrderTest {
    public void testAddFood(){
        //Given
        Order order = new Order();
        Food food = new Food("vajaskenyér", 1000);
        //When
        order.addFood(food);
        //Then
        List<Food> foods = order.getFoods();
        assert foods.contains(food) : "Hiba! A vajaskenyér rajta kell legyen a rendelésen";
    }

    public void testCalculateTotalPrice(){
        //Given
        Order order = new Order();
        Food food1 = new Food("vajaskenyér", 1000);
        Food food2 = new Food("margarinoskenyér", 1);
        //When
        order.addFood(food1);
        order.addFood(food2, 2);
        int result = order.calculateTotalPrice();
        //Then
        assert result == 1002 : "Hiba! A teljes ár 1002$";

    }

    public static void main(String[] args) {
        OrderTest test = new OrderTest();
        //test.testAddFood();
        test.testCalculateTotalPrice();
    }
}
