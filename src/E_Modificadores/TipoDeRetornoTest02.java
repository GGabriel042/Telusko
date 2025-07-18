package E_Modificadores;

class Mobile02 {
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("In static block");
    }

    public Mobile02() {
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }

    public void show() {
        System.out.println(brand + " " + price + " " + name);
    }

    public static void show1(){
        System.out.println("In static method");
    }
}

public class TipoDeRetornoTest02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile02 obj1 = new Mobile02();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile02.name = "SmartPhone";

        Mobile02 obj2 = new Mobile02();

        Mobile02.show1();

//        Class.forName("Mobile02");
    }
}
