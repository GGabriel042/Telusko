package G_AnonymousObject;

class A {
    public A(){
        System.out.println("Objects created");
    }

    public void show() {
        System.out.println("In A show");
    }
}

public class AnonymousObjectTest01 {
    public static void main(String[] args) {
        int marks;
        marks = 99;

        A obj = new A();
        obj.show();

        new A().show();        //Anonymous objects, can only be used once
    }
}
