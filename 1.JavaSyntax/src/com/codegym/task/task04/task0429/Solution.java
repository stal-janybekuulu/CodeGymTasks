package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        Integer[] integers = {a, b, c};

        int positive = 0;
        for (int i=0; i < integers.length; i++) {
            if (integers[i] > 0) {
                positive += 1;
            }
        }

        int negative = 0;
        for (int i=0; i < integers.length; i++) {
            if (integers[i] < 0) {
                negative += 1;
            }
        }

        System.out.println("Number of negative numbers: " + negative);
        System.out.println("Number of positive numbers: " + positive);

    }
}
