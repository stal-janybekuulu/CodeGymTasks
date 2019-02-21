package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number * 2);
        }
        else if (number < 0) {
            System.out.println(number + 1);
        }
        else {
            System.out.println(0);
        }

    }

}