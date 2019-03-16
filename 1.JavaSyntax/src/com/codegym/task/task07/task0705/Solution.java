package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[20];
        int arr1[] = new int[10];
        int arr2[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<arr.length; i++) {
            int numbers = scanner.nextInt();
            arr[i] = numbers;
        }
        System.arraycopy(arr, 0, arr1, 0, arr1.length );
        System.arraycopy(arr, arr1.length, arr2, 0, arr2.length);

        for (int i=0; i<arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
