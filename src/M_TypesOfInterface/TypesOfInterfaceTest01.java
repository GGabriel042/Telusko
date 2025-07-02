package M_TypesOfInterface;

@FunctionalInterface
interface A {
    void show();
//    void run();
}


public class TypesOfInterfaceTest01 {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("in show");
            }
        };
        obj.show();
    }
}
