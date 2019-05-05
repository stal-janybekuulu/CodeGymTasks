package com.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Changing functionality

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = scanner.nextLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            listUpperCase.add(s.toUpperCase());
        }

        /*for (int i = 0; i < listUpperCase.size(); i++) {
            System.out.println(listUpperCase.get(i));
        }*/

        for (int i=0; i<list.size(); i++) {
            String s = list.get(i);
            if (s.length() % 2 == 0) {
                System.out.println(s + " " + s);
            } else {
                System.out.println(s + " " + s + " " + s);
            }
        }
    }
}
