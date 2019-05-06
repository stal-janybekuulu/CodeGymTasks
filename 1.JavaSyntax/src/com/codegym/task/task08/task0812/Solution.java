package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Longest sequence

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        int max = 0;
        int counter = 1;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Integer l = Integer.valueOf(scanner.nextLine());
            list.add(l);
        }

        for (int i = 1; i < 10; i++) {
            if (list.get(i - 1).equals(list.get(i))) {
                counter++;
            }
            else counter = 1;
            if (counter > max) {
                max = counter;
            }
        }
        System.out.println(max);
    }
}