package K_Enum;

enum Status {
    Running, Failed, Pending, Success;
}

public class EnumTest01 {
    public static void main(String[] args) {
        Status sr = Status.Running;
        System.out.println(sr);
        System.out.println(sr.ordinal());

        Status[] sAll = Status.values();

        System.out.println("----------");
        for (Status s : sAll) {
            System.out.println(s + " : " + s.ordinal());
        }

    }
}
