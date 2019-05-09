package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String s = reader.readLine();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        //write your code here
        char[] list = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            list[0] = Character.toUpperCase(list[0]);
            String n = String.valueOf(list[i]);

            if (n.equals(" ")) {
                list[i + 1] = Character.toUpperCase(list[i + 1]);
            }
        }
        System.out.println(list);
    }
}
