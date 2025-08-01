package E_Modificadores;

class A{
    public A(){
        System.out.println("In A");
    }
    public A(int n){
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }
    public B(int n){
        this();
        System.out.println("in B int");
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
