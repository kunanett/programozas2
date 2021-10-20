package zh.sze12.feladat1;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("milk", 4);
        Product product2 = new Product("bread", 3);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product1, 3);
        shoppingCart.printContents();
        System.out.printf("Total price: %d$%n", shoppingCart.calculateTotalPrice());
    }
}
