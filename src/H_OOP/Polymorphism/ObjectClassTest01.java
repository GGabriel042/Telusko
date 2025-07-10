package H_OOP.Polymorphism;

import java.util.Objects;

class Laptop {
    String model;
    int price;

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}

public class ObjectClassTest01 {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Samsung";
        obj.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Samsung";
        obj2.price = 1000;

        boolean result = obj.equals(obj2);

        System.out.println(result);
    }
}
