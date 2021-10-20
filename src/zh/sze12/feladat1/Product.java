package zh.sze12.feladat1;

public class Product {
    private final String name;
    private final int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Product: %s, %d $", name, price);
    }
}
