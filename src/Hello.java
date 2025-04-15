public class Hello {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int c = 5;
        int d = 9;

        boolean result = a > b && c < d;
        boolean result2 = a > b && c > d;
        System.out.println(result);
        System.out.println(result2);
    }
}
