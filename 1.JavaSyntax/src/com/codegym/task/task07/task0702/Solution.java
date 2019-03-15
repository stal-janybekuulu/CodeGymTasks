package com.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/* 
String array in reverse order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String arr[] = new String[10];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<8; i++) {
            String a = scanner.next();
            arr[i] = a;
        }

//        for (int k=0; k<arr.length; k++) {
//            System.out.println(arr[k]);
//        }

        for (int k=9; k>=0; k--) {
            System.out.println(arr[k]);
        }
    }
}