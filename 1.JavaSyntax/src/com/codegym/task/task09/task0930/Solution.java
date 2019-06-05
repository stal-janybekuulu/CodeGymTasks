package com.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // write your code here
        String e = null;
        boolean b = true;
        isGreaterThan("satisfy","condition");
        int j = 0;
        int k = 0;

        ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        ArrayList<String> arrayList3 = new ArrayList<String>();


        for (int i = 0; i < array.length; i++) {
            e = array[i];
            b = isNumber(e);
            if (b == true) {
                arraylist1.add(Integer.parseInt(e));
            } else {
                arrayList2.add((e));
            }
        }

        Collections.sort(arraylist1, Collections.reverseOrder());
        Collections.sort(arrayList2);

        for (int i = 0; i < array.length; i++) {
            e = array[i];
            b = isNumber(e);
            if (b == true) {
                arrayList3.add(i, Integer.toString(arraylist1.get(j)));
                j = j + 1;
            } else {
                arrayList3.add(i, arrayList2.get(k));
                k = k + 1;
            }

        }


        for (int i = 0; i < arrayList3.size(); i++) {
            array[i] = arrayList3.get(i);
        }
    }

    // String comparison method: 'a' is greater than 'b'
    //Метод сравнения строк: «a» больше, чем «b»
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Is the passed string a number?
    // Является ли переданная строка числом?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // The string contains a hyphen, Строка содержит дефис
                    || (!Character.isDigit(c) && c != '-') // or is not a number and doesn't start with a hyphen, или не является числом и не начинается с дефиса
                    || (i == 0 && c == '-' && chars.length == 1)) // or is a single hyphen, или один дефис
            {
                return false;
            }
        }
        return true;
    }
}
