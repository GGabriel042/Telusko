package I_WrapperClass.Test;

class X {
    public void show() {
        System.out.println("In X Show");
    }
}



public class AnonymousClass {
    public static void main(String[] args) {
        X obj = new X() {
            public void show() {
                System.out.println("In new show");
            }
        };

        obj.show();
    }
}
