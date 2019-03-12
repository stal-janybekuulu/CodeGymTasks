package com.codegym.task.task05.task0532;

import java.io.*;
import java.util.Scanner;

/*
Task about algorithms
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int maximum = Integer.MIN_VALUE;;
        int N = scanner.nextInt();
        if (N > 0) {
            int count = 1;
            int number = 0;
            while (count <= N) {
                number = scanner.nextInt();
                count ++;
                if (number > maximum) {
                    maximum = number;
                }
            }
        }
        System.out.println(maximum);
    }
}
