package com.codegym.task.task06.task0609;

/* 
Distance between two points

*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(square((x2 - x1)) + square((y2 - y1)));
        return result;
    }

    static int square(int x) {
        return x*x;
    }
    public static void main(String[] args) {

    }
}
