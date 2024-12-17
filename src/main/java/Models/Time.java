package Models;

import java.time.LocalDateTime;

public class Time {
    private static Time instance;
    public int hour;
    public int minute;
    public int day;
    public int month;
    public int year;

    public Time() {
        LocalDateTime now = LocalDateTime.now();
        this.day = now.getDayOfMonth();
        this.month = now.getMonthValue();
        this.year = now.getYear();
        this.hour = now.getHour();
        this.minute = now.getMinute();
        // System.out.println(toString());
    }

    public Time(String hour, String minute, String day, String month, String year) {
        this.day = Integer.parseInt(day);
        this.month = Integer.parseInt(month);
        this.year = Integer.parseInt(year);
        this.hour = Integer.parseInt(hour);
        this.minute = Integer.parseInt(minute);
    }

    public Time(int hour, int minute, int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
    }

    public static Time getInstance() {
        return (instance == null) ? instance = new Time() : instance;
    }

    public String toString() {
        // return day + ":" + month + ":" + year + " - at: " + hour + ":" + minute;
        return String.format("%02d/%02d/%04d - at: %02d:%02d", day, month, year, hour, minute);
        // toString automatically called when the object of this class is call for
        // printing content.
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

    public void setDay(int day) {
        this.day = day;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
