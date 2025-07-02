package L_Annotations;

class A {
    public void showTheClass() {
        System.out.println("in show A");
    }
}

class B extends A {

    @Override
    public void showTheClassName() {
        System.out.println("in show B");
    }
}

public class AnnotationsTest01 {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheClass();
    }
}
