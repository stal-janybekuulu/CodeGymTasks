package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double number = 0;
        double sum = 0;
        int count = 0;

        while (number != -1) {
            number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            else {
                sum += number;
                count ++;
            }
        }
        System.out.println(sum / count);
    }
}

