package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[15];
        int even = 0;
        int odd = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<arr.length; i++) {
            int numbers = scanner.nextInt();
            arr[i] = numbers;
        }

        for (int j=0; j<arr.length; j++) {
            if (j % 2 == 0 || j == 0) {
                even = even + arr[j];
            }
            else odd = odd + arr[j];
        }

        if (even > odd) {
            System.out.println("Even-numbered houses have more residents.");
        }
        else
            System.out.println("Odd-numbered houses have more residents.");


    }
}
