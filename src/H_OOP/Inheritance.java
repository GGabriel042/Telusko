package H_OOP;

public class Inheritance {
    public static void main(String[] args) {
        AdvancedCalc calc = new AdvancedCalc();
        int r1 = calc.add(5, 7);
        int r2 = calc.sub(5, 3);
        int r3 = calc.multi(5, 7);
        int r4 = calc.div(5, 3);

        System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4);
    }
}
