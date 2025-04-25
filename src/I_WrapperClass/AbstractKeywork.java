package I_WrapperClass;

abstract class Car {

    public abstract void drive();

//    public abstract void fly();

    public void playMusic(){
        System.out.println("Playing music");
    }
}

class WagonR extends Car {
    public void drive() {
        System.out.println("Driving car");
    }
}

public class AbstractKeywork {
    public static void main(String[] args) {

        WagonR car = new WagonR();
        car.drive();
        car.playMusic();

    }
}
