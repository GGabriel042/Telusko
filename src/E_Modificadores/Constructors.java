package E_Modificadores;

class Human02 {
    private int age;
    private String name;

    public Human02(int age, String name) {
        this.age = age;
        this.name = name;
    }

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

public class Constructors {
    public static void main(String[] args) {
        Human02 obj = new Human02(26, "Gabriel");
//        obj.age = 11;
//        obj.name = "Navin";
//
//        obj.setAge(26);
//        obj.setName("Gabriel");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
