package com.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

/* 
Flip the array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int array[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<array.length; i++) {
            int numbers = scanner.nextInt();
            array[i] = numbers;
        }

        for (int j=9; j>=0; j--) {
            System.out.println(array[j]);
        }

//        Integer[] integers = Arrays.stream(array).boxed().sorted(Collections.reverseOrder()).toArray(Integer[]::new);
//
//        for (int j=0; j<integers.length; j++) {
//            System.out.println(integers[j]);
//        }
    }
}

