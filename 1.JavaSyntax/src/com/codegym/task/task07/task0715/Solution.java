package com.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> l = new ArrayList<>();
        l.add("Sam");
        l.add("I");
        l.add("Am");

        for (int i=1; i<6; i=i+2) {
            l.add(i, "Ham");
        }
        for (int i=0; i<l.size(); i++) {
            System.out.println(l.get(i));
        }

        /*for (String list: l) {
            System.out.println(list);
        }*/
    }
}
