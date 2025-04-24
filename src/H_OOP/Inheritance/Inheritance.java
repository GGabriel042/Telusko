package H_OOP.Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        VeryAdvCalc calc = new VeryAdvCalc();
        int r1 = calc.add(5, 7);
        int r2 = calc.sub(5, 3);
        int r3 = calc.multi(5, 7);
        int r4 = calc.div(5, 3);
        double r5 = calc.power(5, 3);

        System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4 + " : " + r5);
    }
}
