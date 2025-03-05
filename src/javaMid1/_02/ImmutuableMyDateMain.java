package javaMid1._02;

public class ImmutuableMyDateMain {

    public static void main(String[] args) {
        ImmutableMydate date1 = new ImmutableMydate(2024, 1, 1);
        ImmutableMydate date2 = date1;

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2024 -> 2025");
        date1 = date1.withYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

    }
}
