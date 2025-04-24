package E_Modificadores;

class Mobile {
    String brand;
    int price;
    static String name = "SmartPhone";

    public void show() {
        System.out.println(brand + " " + price + " " + name);
    }
}

public class TipoDeRetornoTest {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;

        obj1.name = "Phone";

        obj1.show();
        obj2.show();
    }
}
