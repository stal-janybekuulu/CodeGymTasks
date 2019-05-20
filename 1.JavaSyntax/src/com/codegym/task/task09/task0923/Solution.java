package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayList<String> v = new ArrayList<>();
        ArrayList<String> cn = new ArrayList<>();

        for(char x : input.toCharArray()){
            if(x == ' ') continue; // this is what is needed to pass
            if (isVowel(x))
                v.add(String.valueOf(x));
            else
                cn.add(String.valueOf(x));
        }

        /*ArrayList<String> p = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (isVowel((input.charAt(i))) == true) {
                v.add(String.valueOf(input.charAt(i)));
            } else if (input.contains(" ")) {
                c.add(String.valueOf(input.charAt(i)));
            } else p.add(String.valueOf(input.charAt(i)));
        }*/

        for (String s : v) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (String s : cn) {
            System.out.print(s + " ");
        }
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}