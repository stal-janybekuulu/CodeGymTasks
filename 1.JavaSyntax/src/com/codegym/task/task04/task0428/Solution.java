package com.codegym.task.task04.task0428;

/* 
Positive number

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
        int count = 0;
        for (int i=0; i < integers.length; i++) {
            if (integers[i] > 0) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
