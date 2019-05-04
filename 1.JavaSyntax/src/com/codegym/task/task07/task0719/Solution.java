package com.codegym.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/* 
Display numbers in reverse order

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<10; i++) {
            list.add(scanner.nextInt());
        }

        for (int i=list.size()-1; i>=0;i--) {
            System.out.println(list.get(i));
        }

        /*// display reverse order
        for (int i: list) {
            // create comparator for reverse order
            Comparator<Integer> cmp = Collections.reverseOrder();

            // sort the list
            Collections.sort(list, cmp);
            System.out.println(i);
        }*/
    }
}
