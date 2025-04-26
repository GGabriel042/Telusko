package K_Enum;

enum Laptop {
    Macbook(2000), XPS(2200), Surface(), ThinkPad(1800);
    private int price;

    Laptop() {
        price = 500;
    }

    Laptop(int price) {
        this.price = price;
        System.out.println("in Laptop " + this.name());
    }

    public int getPrice() {
        return price;
    }
}

public class EnumTest02 {
    public static void main(String[] args) {
//        Laptop lap = Laptop.XPS;
//        System.out.println(lap + " : " + lap.getPrice());

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
