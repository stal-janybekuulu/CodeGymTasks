package com.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/* 
Ascending numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i=0; i<arr.length; i++) {
            int a = scanner.nextInt();
            arr[i] = a;
        }
        Arrays.sort(arr);
        for (int k=0; k<arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}
