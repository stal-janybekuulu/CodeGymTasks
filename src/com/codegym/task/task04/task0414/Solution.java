package com.codegym.task.task04.task0414;

/* 
Number of days in the year

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 400 == 0) {
            year = 366;
            System.out.println("Number of days in the year: " + year);
        }
        else if (year % 100 == 0) {
            year = 365;
            System.out.println("Number of days in the year: " + year);
        }
        else if (year % 4 == 0) {
            year = 366;
            System.out.println("Number of days in the year: " + year);
        }
        else {
            year = 365;
            System.out.println("Number of days in the year: " + year);
        }
    }
}