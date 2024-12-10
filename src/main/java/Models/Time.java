package Models;

public class Time {
    private static Time instance;
    public int day;
    public int month;
    public int year;
    public int hour;

    private Time() {
    }

    public Time(int day, int month, int year, int hour) {
        // TODO get current time from Window OS
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
    }

    public static Time getInstance() {
        return (instance == null) ? instance = new Time() : instance;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
