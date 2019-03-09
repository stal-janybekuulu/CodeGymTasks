package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

*/

import javax.print.attribute.IntegerSyntax;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        Integer[] integers = {a, b, c};
        Arrays.sort(integers,Collections.reverseOrder());
        for (int i = 0; i < integers.length; i ++) {
            System.out.print(integers[i] + " ");
        }
//        if (a < b && b < c) {
//            System.out.println(c + " " + b + " " + a);
//        }
//
//        else if (b < a && a < c) {
//            System.out.println(c + " " + a + " " + b);
//        }
//
//        else if (c < a && a < b) {
//            System.out.println(b + " " + a + " " + c);
//        }
//        else if (c < b && b < a) {
//            System.out.println(a + " " + b + " " + c);
//        }
//        else if (a == b && b < c) {
//            System.out.println(c + " " + b + " " + a);
//        }
//        else if (c == a && a < b) {
//            System.out.println(b + " " + a + " " + c);
//        }
//        else if (b == c && c < a) {
//            System.out.println(a + " " + c + " " + b);
//        }
    }
}
