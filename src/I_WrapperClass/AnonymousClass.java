package I_WrapperClass;

abstract class X {
    abstract public void show();
    abstract public void config();
}

public class AnonymousClass {
    public static void main(String[] args) {

        X obj = new X() {
            public void show() {
                System.out.println("In new Show");
            }

            public void config() {
                System.out.println("In new config");
            }
        };

        obj.show();
        obj.config();
    }
}
