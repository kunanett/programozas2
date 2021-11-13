package zh.sze14.feladat1;

import java.util.List;

public class OrderTest {

    private Order order;

    private void setUp(){
        order = new Order();
    }

    public void testAddFood(){
        //Given
        setUp();
        Food food = new Food("vajaskenyér", 1000);
        //When
        order.addFood(food);
        //Then
        List<Food> foods = order.getFoods();
        assert foods.contains(food) : "Hiba! A vajaskenyér rajta kell legyen a rendelésen";
    }

    public void testCalculateTotalPrice(){
        //Given
        setUp();
        Food food1 = new Food("vajaskenyér", 1000);
        Food food2 = new Food("margarinoskenyér", 1);
        //When
        order.addFood(food1);
        order.addFood(food2, 2);
        int result = order.calculateTotalPrice();
        //Then
        assert result == 1002 : "Hiba! A teljes ár 1002$";

    }

    public void runTests(){
        testAddFood();
        testCalculateTotalPrice();
    }

    public static void main(String[] args) {
        OrderTest test = new OrderTest();
        test.runTests();
    }
}
