package javaMid1._02;

public class ImmutableMydate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMydate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMydate withYear(int newYear) {
        return new ImmutableMydate(newYear, month, day);
    }

    public ImmutableMydate withMonth(int newMonth) {
        return new ImmutableMydate(year, newMonth, day);
    }

    public ImmutableMydate withDay(int newDay) {
        return new ImmutableMydate(year, month, newDay);
    }

    @Override
    public String toString() {
        return "ImmutableMydate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
