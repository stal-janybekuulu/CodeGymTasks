package com.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/* 
Maximum in an array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int arr[] = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<arr.length; i++) {
            int a = scanner.nextInt();
            arr[i] = a;
        }
        return arr;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i=0; i<array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
