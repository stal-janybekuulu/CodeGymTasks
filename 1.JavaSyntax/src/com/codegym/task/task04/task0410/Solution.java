package com.codegym.task.task04.task0410;

/* 
Come on, lucky seven!
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        if (a >= 50 && a <= 100) {
            System.out.println("The number " + a + " is in the interval.");
        }
        else {
            System.out.println("The number " + a + " is not in the interval.");
        }
    }
}