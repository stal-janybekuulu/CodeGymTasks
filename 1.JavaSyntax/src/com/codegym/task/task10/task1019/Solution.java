package com.codegym.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Functionality is not enough!

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hashMap = new HashMap<>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            int id = Integer.parseInt(s);
            String name = reader.readLine();
            if (name.isEmpty()) {
                System.out.println(id + " ");
                hashMap.put(name, id);
            }
            else {
                System.out.println(id + " " + name);
                hashMap.put(name, id);
            }
        }
    }
}
