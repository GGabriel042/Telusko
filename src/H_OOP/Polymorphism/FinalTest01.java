package H_OOP.Polymorphism;

class Calc{
    public final void show(){
        System.out.println("In Calc Show, by Gabriel");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc {
//    public void show(){
//        System.out.println("In Calc Show, by John");
//    }
}

public class FinalTest01 {
    public static void main(String[] args) {
        final int num = 8;
//        num = 9;
        System.out.println(num);

        AdvCalc calc = new AdvCalc();
        calc.show();
        calc.add(5,4);
    }
}
