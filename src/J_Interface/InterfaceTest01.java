package J_Interface;

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run : Faster");
    }
}

class Developer {
    public void devApp(Computer computer) {
        computer.code();
    }
}

public class InterfaceTest01 {
    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer navin = new Developer();

        navin.devApp(desk);
    }
}
