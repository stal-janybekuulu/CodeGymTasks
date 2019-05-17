package com.codegym.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;

/* 
Working with dates

*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("MAY 1 2013"));
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));

    }

    public static boolean isDateOdd(String date) {

        /*Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);      // первое число
        yearStartTime.setMonth(0);     // месяц январь, нумерация для месяцев 0-11

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance/msDay);*/

        Calendar calendar = Calendar.getInstance();
        Date d = new Date(date);
        calendar.setTime(d);
        int dayCount = calendar.get(Calendar.DAY_OF_YEAR);
        int dayMonth = calendar.get(Calendar.DAY_OF_MONTH);

        if (dayCount % 2 != 0 || dayMonth == 1) {
            return true;
        } else return false;

    }
}
