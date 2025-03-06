package javaMid1._06._01;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 12, 17);
        LocalDate endDate = LocalDate.of(2025, 3, 16);

        Period period = Period.between(startDate, endDate);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("시작 날짜 : " + startDate);
        System.out.println("목표 날짜 : " + endDate);
        System.out.println("남은 기간 : " + period.getYears() + "년 " + period.getMonths() + "개월" + period.getDays() + "일");
        System.out.println("디데이 : " + daysBetween + "일 남음");
    }
}
