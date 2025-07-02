package M_TypesOfInterface;

@FunctionalInterface
interface A {
    int add(int i, int j);
}

public class TypesOfInterfaceTest01 {
    public static void main(String[] args) {
        A obj = (i, j) -> i + j;
        int result = obj.add(5, 2);
        System.out.println(result);
    }
}
