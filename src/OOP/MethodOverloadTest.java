package OOP;

class Calculator2 {
    public int add (int num1, int num2) {
        return num1 + num2;
    }

    public double add (int num1, int num2, double num3) {
        return num1 + num2 + num3;
    }
}

public class MethodOverloadTest {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();

        int add1 = calc.add(5, 6);
        double add2 = calc.add(5, 6, 7.5);

        System.out.println(add1);
        System.out.println(add2);
    }
}
