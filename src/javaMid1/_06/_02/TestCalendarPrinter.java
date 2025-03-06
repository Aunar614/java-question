package javaMid1._06._02;

import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class TestCalendarPrinter {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("년도를 입력하세요 : ");
        bw.flush();
        int year = Integer.parseInt(br.readLine());

        bw.write("월을 입력하세요 : ");
        bw.flush();
        int month = Integer.parseInt(br.readLine());

        printCalendar(year, month);

        br.close();
        bw.close();
    }

    private static void printCalendar(int year, int month) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        bw.write("Su Mo Tu We Th Fr Sa " + "\n");

        for (int i = 0; i < offsetWeekDays; i++) {
            bw.write("   ");
        }

        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            bw.write(String.format("%2d ", dayIterator.getDayOfMonth()));
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                bw.write("\n");
            }
            dayIterator = dayIterator.plusDays(1);
        }

        bw.close();
    }
}
