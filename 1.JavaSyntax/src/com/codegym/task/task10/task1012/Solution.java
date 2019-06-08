package com.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Number of letters

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // write your code here
        Map<Character , Integer> map = new HashMap<>();
        for (int i = 0 ; i < list.size() ; i++){
            String s = list.get(i);
            for (char x : s.toCharArray()){
                if (!map.containsKey(x)){
                    map.put(x, 1);
                }
                else
                    map.put(x, map.get(x) + 1);
            }
        }
        for(char x : abcArray) {
            if (map.get(x) == null) {
                System.out.println(x + " " + 0);
            } else System.out.println(x + " " + map.get(x));
        }
    }
}
