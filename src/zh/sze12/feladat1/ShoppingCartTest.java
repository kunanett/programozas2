package zh.sze12.feladat1;

import java.util.List;

public class ShoppingCartTest {

    public void testAddProduct(){
        //Given
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product("tej", 3);
        //When
        shoppingCart.addProduct(product);
        //Then
        List<Product> products = shoppingCart.getProducts();
        assert products.contains(product) : "A tej benne kell legyen a kosárban";
    }

    public void testCalculateTotalPrice(){
        //Given
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product1 = new Product("tej", 3);
        Product product2 = new Product("kakajó", 4);
        //When
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        int result = shoppingCart.calculateTotalPrice();
        //Then
        assert result == 7 : "A teljes ár 7$";
    }

    public static void main(String[] args) {
        ShoppingCartTest test = new ShoppingCartTest();
        test.testAddProduct();
        test.testCalculateTotalPrice();
    }
}
