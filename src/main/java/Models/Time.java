package Models;

import java.time.LocalDateTime;

public class Time {
    private static Time instance;
    public int hour;
    public int day;
    public int month;
    public int year;

    public Time() {
        LocalDateTime now = LocalDateTime.now();
        this.day = now.getDayOfMonth();
        this.month = now.getMonthValue();
        this.year = now.getYear();
        this.hour = now.getHour();
    }

    public Time(String hour, String day, String month, String year) {
        this.day = Integer.parseInt(day);
        this.month = Integer.parseInt(month);
        this.year = Integer.parseInt(year);
        this.hour = Integer.parseInt(hour);
    }

    public Time(int hour, int day, int month, int year) {
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
    }// toString automatically called when the object of this class is call for
     // printing content.

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
