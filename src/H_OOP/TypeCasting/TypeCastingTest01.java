package H_OOP.TypeCasting;

class A {
    public void show1(){
        System.out.println("In A show");
    }
}
class B extends A {
    public void show2(){
        System.out.println("In B show");
    }
}

public class TypeCastingTest01 {
    public static void main(String[] args) {
//        double d = 4.5;
//        int i = (int) d;
//
//        System.out.println(i);

        A obj = (A) new B();
        obj.show1();

        B obj2 = (B) obj;
        obj2.show2();
    }
}
