package com.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        try {
            while (true) {
                Integer num = Integer.valueOf(scanner.nextLine());
                numbers.add(num);
            }
        } catch (Exception e) {
            for (Integer n : numbers) {
                System.out.println(n);
            }
        }
    }
}
