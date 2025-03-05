package javaMid1._03._02;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("reversed = " + reversed);
    }
}
