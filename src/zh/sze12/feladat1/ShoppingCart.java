package zh.sze12.feladat1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class ShoppingCart {

    private final List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    //beletesz egy terméket a kosárba
    public void addProduct(Product product) {
        products.add(product);
    }

    //adott productból numberOf mennyiséget tesz a kosárba
    public void addProduct(Product product, int numberOf) {
        for (int i = 0; i < numberOf; i++) {
            addProduct(product);
        }
    }

    //kiszámolja, hogy mennyi a teljes ár
    public int calculateTotalPrice() {
        int totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    //kiír egy összegzést a kosár tartalmáról
    //a Product objektumok összehasonlításához elegendő a name adattagot vizsgálni
    public void printContents() {/*
        String[] productNames = new String[products.size()];
        int[] productNumber = new int[productNames.length];

        int index = 0;
        for (Product currentProduct : products) {
            int i = 0;
            boolean foundProduct = false;
            while (i <= index && !foundProduct) {
                if (currentProduct.getName().equals(productNames[i])) {
                    productNumber[i]++;
                    foundProduct = true;
                }
                i++;
            }
            if (!foundProduct) {
                productNames[index] = currentProduct.getName();
                productNumber[index] = 1;
                index++;
            }
        }

        System.out.println("ShoppingCart contents:");
        for (int i = 0; i < index; i++) {
            System.out.printf("%s: %d%n", productNames[i], productNumber[i]);
        }*/
        Map<Product, Integer> stat = new HashMap<>();
        for (Product p: products){
            if(stat.containsKey(p)){
                stat.replace(p, stat.get(p) + 1);
            }else{
                stat.put(p, 1);
            }
        }

        for (Map.Entry<Product, Integer> entry : stat.entrySet()){
            System.out.println(entry.getKey().getName() + ": " + entry.getValue());
        }
    }
}
