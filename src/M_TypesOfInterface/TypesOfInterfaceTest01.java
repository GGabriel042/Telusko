package M_TypesOfInterface;

@FunctionalInterface
interface A {
    void show(int i);
//    void run();
}

public class TypesOfInterfaceTest01 {
    public static void main(String[] args) {
        A obj = i -> System.out.println("in show " + i);
        obj.show(5);
    }
}
