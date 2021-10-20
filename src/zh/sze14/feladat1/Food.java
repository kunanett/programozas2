package zh.sze14.feladat1;

import java.util.Objects;

public class Food {
    private final String name;
    private final int price;

    Food(String name, int price) {
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
        return String.format("Food: %s, %d $", name, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Food food = (Food) o;
        return getPrice() == food.getPrice() && Objects.equals(getName(), food.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }
}
