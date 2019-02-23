package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        //double minute = (time - (int)Math.floor(time)) * 50 / 5;

        double minute = t % 5;
        //System.out.println(t);
        if (minute >= 0 && minute < 3) {
            System.out.println("green");
        }
        else if (minute >= 3 && minute < 4) {
            System.out.println("yellow");
        }
        else if (minute >= 4 && minute < 5) {
            System.out.println("red");
        }
    }
}