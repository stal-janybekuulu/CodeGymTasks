package com.codegym.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Minimum of N numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Find the minimum here
        int min = Collections.min(array);
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Create and initialize a list here
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            integers.add(number);
        }
        return integers;
    }
}
