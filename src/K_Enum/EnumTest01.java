package K_Enum;

enum Status {
    Running, Failed, Pending, Success;
}

public class EnumTest01 {
    public static void main(String[] args) {
//        Status sr = Status.Running;
//        System.out.println(sr);
//        System.out.println(sr.ordinal());
//
//        Status[] sAll = Status.values();
//
//        System.out.println("----------");
//        for (Status s : sAll) {
//            System.out.println(s + " : " + s.ordinal());
//        }

        Status s = Status.Failed;

        System.out.println(s.getClass().getSuperclass());


        switch (s){
            case Running -> System.out.println("All good");
            case Failed -> System.out.println("Try again");
            case Pending -> System.out.println("Please wait");
            default -> System.out.println("Done");
        }


        if (s == Status.Running) {
            System.out.println("All good");
        } else if (s == Status.Failed) {
            System.out.println("Try again");
        } else if (s == Status.Pending) {
            System.out.println("Please wait");
        } else System.out.println("Done");

    }
}
