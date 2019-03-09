package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int length = String.valueOf(a).length();
        // System.out.println(length);
        if (a >= 1 && a <= 999) {
            if (a % 2 == 0 && length == 1) {
                System.out.println("even single-digit number");
            }
            else if (a % 2 != 0 && length == 1) {
                System.out.println("odd single-digit number");
            }
            else if (a % 2 == 0 && length == 2) {
                System.out.println("even two-digit number");
            }
            else if (a % 2 != 0 && length == 2) {
                System.out.println("odd two-digit number");
            }
            else if (a % 2 == 0 && length == 3) {
                System.out.println("even three-digit number");
            }
            else if (a % 2 != 0 && length == 3) {
                System.out.println("odd three-digit number");
            }
        }

    }
}
