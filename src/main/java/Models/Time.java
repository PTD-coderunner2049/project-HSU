package Models;

import java.time.LocalDateTime;

public class Time {
    private static Time instance;
    public int day;
    public int month;
    public int year;
    public int hour;

    public Time() {
        LocalDateTime now = LocalDateTime.now();
        this.day = now.getDayOfMonth();
        this.month = now.getMonthValue();
        this.year = now.getYear();
        this.hour = now.getHour();
    }

    public Time(String day, String month, String year, String hour) {
        this.day = Integer.parseInt(day);
        this.month = Integer.parseInt(month);
        this.year = Integer.parseInt(year);
        this.hour = Integer.parseInt(hour);
    }

    public Time(int day, int month, int year, int hour) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
    }

    public static Time getInstance() {
        return (instance == null) ? instance = new Time() : instance;
    }

    public String toString() {
        return day + ":" + month + ":" + year + " - at: " + hour + ":00 [24]";
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
