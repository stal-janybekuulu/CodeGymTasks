package com.codegym.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
To the top of the list

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<10; i++) {
            String text = scanner.nextLine();
            list.add(0, text);
        }

        for (int i=0; i<10; i++) {
            System.out.println(list.get(i));
        }
    }
}
