package J_Interface;

interface A {
    int age = 44;                     //all variables are final and static
    String area = "Mumbai";

    void show();
    void config();
}

class B implements A {

    @Override
    public void show() {
        System.out.println("In show");
    }

    @Override
    public void config() {
        System.out.println("In config");
    }
}

public class InterfaceTest02 {
    public static void main(String[] args) {
        A obj;
        obj = new B();

        obj.show();
        obj.config();

//        A.area = "Dubai";                   cant be changed

        System.out.println(A.age);
        System.out.println(A.area);
    }
}
