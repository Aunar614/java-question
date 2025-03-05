package javaMid1._03._02;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] strings = email.split("@");

        System.out.println("ID : " + strings[0]);
        System.out.println("Domain : " + strings[1]);
    }
}
