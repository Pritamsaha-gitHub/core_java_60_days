package com.example.Core.Java.Enums;

public class returnNextDay {
    public static void main(String[] args) {

        DaysOfWeek weekdays = DaysOfWeek.Monday;
        DaysOfWeek nextday = nextDay(weekdays);
        System.out.println(nextday);
    }
    public static DaysOfWeek nextDay(DaysOfWeek days) {
//        if (days.equals("Saturday")) return DaysOfWeek.Sunday;

        boolean flag = false;
        for (DaysOfWeek daysOfWeek : DaysOfWeek.values()) {
            if (flag) {
                return daysOfWeek;
            }
            if (daysOfWeek.equals(days)) {
                flag = true;
            }
        }
        return DaysOfWeek.values()[0];
    }
}
