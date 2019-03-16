package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        //strings = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        //String textOut = null;
        for (int i=0; i<5; i++) {
            String text = scanner.nextLine();
            strings.add(text);
        }


        int maxSize = 0;

        for (int i=0; i<strings.size(); i++) {
            if (maxSize < strings.get(i).length()) {
                maxSize = strings.get(i).length();
            }
        }

        for (int i=0; i<strings.size(); i++) {
            if (maxSize == strings.get(i).length()) {
                System.out.println(strings.get(i));
            }
        }

    }
}
