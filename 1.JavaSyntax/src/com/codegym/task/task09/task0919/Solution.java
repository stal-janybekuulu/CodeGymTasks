package com.codegym.task.task09.task0919;

/* 
Dividing by zero

*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero() {
        int a = 10;
        int b = a / 0;
        try {
            b = a / 0;
        } catch (ArithmeticException e) {
            System.out.println(b);
        }
    }

    /*public static void printStackTrace(Throwable throwable) {
        for(StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }*/
}
