package javaMid1._03._01;

public class TestString4 {

    public static void main(String[] args) {
        String str = "hello.txt";

        int index1 = str.indexOf("hello");
        int index2 = str.indexOf(".txt");

        String fileName = str.substring(index1, index2);
        String extName = str.substring(index2);

        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
