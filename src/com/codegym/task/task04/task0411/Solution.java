package com.codegym.task.task04.task0411;

/* 
Seasons on Terra

*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if (month >= 3 && month <= 5) {
            System.out.println("spring");
        }
        else if (month >= 6 && month <= 8) {
            System.out.println("summer");
        }
        else if (month >= 9 && month <= 11) {
            System.out.println("autumn");
        }
        else {
            System.out.println("winter");
        }
    }
}