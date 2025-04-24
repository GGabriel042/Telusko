package C_Objects;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Navin");

        System.out.println(sb.capacity() + " Capacity");
        System.out.println(sb.length() + " Capacity");

        sb.append(" Reddy");
        System.out.println(sb);

        sb.deleteCharAt(5);
        System.out.println(sb + " removing space");
        sb.insert(5, " ");
        System.out.println(sb + " adding space");

//        String str = sb.toString();
//        System.out.println(str);


    }
}
