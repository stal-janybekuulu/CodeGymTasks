package com.codegym.task.task04.task0415;

/* 
Rule of the triangle

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a + b > c) || (b + c > a) || (a + c > b) ) {
            System.out.println("The triangle is possible.");
        }
        else {
            System.out.println("The triangle is not possible.");
        }

    }
}