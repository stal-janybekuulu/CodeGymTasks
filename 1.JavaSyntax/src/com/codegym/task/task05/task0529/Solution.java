package com.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import static jdk.nashorn.internal.runtime.JSType.toInteger;

/* 
Console-based piggy bank

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String number = null;
        int sum = 0;

        while (number != "sum") {
            number = scanner.next();
            if (number.equals("sum")) {
                break;
            }
            else {
                sum += Integer.parseInt(number);
            }
        }
        System.out.println(sum);
    }
}
