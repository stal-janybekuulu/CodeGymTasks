package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String arr[] = new String[10];
        int array[] = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<arr.length; i++) {
            String inputString = scanner.nextLine();
            arr[i] = inputString;
            array[i] = inputString.length();
        }
        for (int j=0; j<array.length; j++) {
            System.out.println(array[j]);
        }
    }
}
