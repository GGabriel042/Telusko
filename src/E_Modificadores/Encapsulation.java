package E_Modificadores;

class Human {
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
//        obj.age = 11;
//        obj.name = "Navin";
//
        obj.setAge(26);
        obj.setName("Gabriel");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
