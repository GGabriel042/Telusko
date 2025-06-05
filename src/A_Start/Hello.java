package A_Start;

public class Hello {
    public static void main(String[] args) {
        int i = 1;

        while (i < 5) {
            System.out.println("Hi "+ i);
            i++;

            int j = 1;
            while (j < 5) {
                System.out.println("Start.Hello "+j);
                j++;
            }
            System.out.println("---------------");
        }
    }
}
