package com.codegym.task.task04.task0424;

/* 
Three numbers

*/

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        Integer[] array = {a, b, c};

        if (array[0] == array[1] && array[1] != array[2]) {
            System.out.println(3);
        }
        else if (array[0] == array[2] && array[2] != array[1]) {
            System.out.println(2);
        }
        else if (array[1] == array[2] && array[2] != array[0]) {
            System.out.println(1);
        }
    }
}
