package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Checking the order

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<10; i++) {
            list.add(scanner.nextLine());
        }

        for (int i=0; i<list.size(); i++) {
            if (list.get(i).length() > list.get(i+1).length()) {
                System.out.println(i+1);
                break;
            }
            else continue;
        }

        /*Collections.sort(list, Comparator.comparing(String::length));
        for (String li: list) {
            System.out.println(li);
        }*/
    }
}

