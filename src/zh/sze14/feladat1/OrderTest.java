package zh.sze14.feladat1;

public class OrderTest {

    private Order underTest;

    private void init(){
        underTest = new Order();
    }

    public void testAddFood(){
        //GIVEN
        init();
        Food food = new Food("salad", 7);
        //WHEN
        underTest.addFood(food);
        //THEN
        assert underTest.getFoods().contains(food);
    }

    public void runTest(){
        testAddFood();
        System.out.println("Tests passed.");
    }

    public static void main(String[] args) {
        OrderTest orderTest = new OrderTest();
        orderTest.runTest();
    }
}
