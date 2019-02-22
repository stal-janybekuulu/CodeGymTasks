package com.codegym.task.task04.task0413;

/* 
Day of the week

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int day_of_week = scanner.nextInt();

        if (day_of_week == 1) {
            System.out.println("Monday");
        }
        else if (day_of_week == 2) {
            System.out.println("Tuesday");
        }
        else if (day_of_week == 3) {
            System.out.println("Wednesday");
        }
        else if (day_of_week == 4) {
            System.out.println("Thursday");
        }
        else if (day_of_week == 5) {
            System.out.println("Friday");
        }
        else if (day_of_week == 6) {
            System.out.println("Saturday");
        }
        else if (day_of_week == 7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("No such day of the week");
        }
    }
}