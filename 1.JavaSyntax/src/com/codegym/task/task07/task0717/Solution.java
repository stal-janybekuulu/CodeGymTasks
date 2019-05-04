package com.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Duplicating words

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Read strings from the console and declare an ArrayList here
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<10; i++) {
            list.add(scanner.nextLine());
        }
        ArrayList<String> result = doubleValues(list);

        // Display result
        for (String r: result) {
            System.out.println(r);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //write your code here
        ArrayList<String> dl = new ArrayList<>();
        ArrayList<String> tl = new ArrayList<>();
        for (String li: list) {
            dl.add(li);
        }
        for (int i=0; i<list.size(); i++) {
            if (list.get(i).equals(dl.get(i)) && list.get(i) == dl.get(i)) {
                tl.add(list.get(i));
                tl.add(dl.get(i));
            }
        }
        list = tl;
        return list;
    }
}
