package N_Error;

public class ErrorTest02 {
    public static void main(String[] args) {

        int i = 2;
        int j = 0;

        int nums[] = new int[5];

        String str = null;

        try
        {
            j = 8/i;
            System.out.println(nums[1]);
            System.out.println(nums[2]);
            System.out.println(str.length());

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in the limit of the array "+e);
        } catch (Exception e) {
            System.out.println("Something went wrong " +e);
        }

        System.out.println(j);


        System.out.println("Bye");
    }
}
