package J_Interface;

// class -> class : extends
// class -> interface : implements
// interface -> interface : extends

interface X {
    int age = 44;                     //all variables are final and static
    String area = "Mumbai";

    void show();
    void config();
}

interface Z {
    void run();
}

interface ZZ extends Z {

}

class Y implements X, ZZ {

    @Override
    public void show() {
        System.out.println("In show");
    }

    @Override
    public void config() {
        System.out.println("In config");
    }

    @Override
    public void run() {
        System.out.println("Running...");
    }
}

public class InterfaceTest03 {
    public static void main(String[] args) {
        X obj;
        obj = new Y();

        obj.show();
        obj.config();

//        X.area = "Dubai";                   cant be changed

        System.out.println(X.age);
        System.out.println(X.area);
    }
}
