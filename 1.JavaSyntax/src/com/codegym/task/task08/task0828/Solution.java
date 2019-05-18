package com.codegym.task.task08.task0828;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Month number
The program reads the name of the month from the keyboard and then displays its number on the screen in a phrase like: "May is month 5".
Use collections.

Requirements:
1. The program should read one value from the keyboard.
2. The program should display text on the screen.
3. The program must use collections.
4. The program should read from the keyboard the name of the month and display its number on the screen according to the specified template.

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String monthFromKeyBoard = scanner.nextLine();

        HashMap<String, Integer> monthList = new HashMap<String, Integer>() {};
        monthList.put("January", 1);
        monthList.put("February", 2);
        monthList.put("March", 3);
        monthList.put("April", 4);
        monthList.put("May", 5);
        monthList.put("June", 6);
        monthList.put("July", 7);
        monthList.put("August", 8);
        monthList.put("September", 9);
        monthList.put("October", 10);
        monthList.put("November", 11);
        monthList.put("December", 12);

        Set<String> keys = new HashSet<>();
        for (String k: monthList.keySet()) {
            if (monthFromKeyBoard.equalsIgnoreCase(k)) {
                int x = monthList.get(k);
                System.out.println(k + " is month " + x);
            }
        }

    }
}
