package com.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            String text = scanner.nextLine();
            list.add(text);
        }

        for (int i=0; i<13; i++) {
            String s = list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0, s);
        }

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
