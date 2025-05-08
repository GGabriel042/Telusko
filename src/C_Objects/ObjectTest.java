package C_Objects;

class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

public class ObjectTest {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 4));

    }
}
