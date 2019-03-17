package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            String text = scanner.nextLine();
            list.add(text);
        }

        String shortest = list.get(0); //помещаем значение с индексом 0 в переменную
        String h = ""; //объявляем строковую переменную
        for (String st : list) { //перебираем массив
            if (st.length() < shortest.length()) {
                shortest = st;
            }
            if (st.length() == shortest.length()) {
                h = st;
            }
        }

        for (int i=0; i<5; i++) {
            if (shortest.length() == list.get(i).length()) {
                System.out.println(list.get(i));
            }
        }
    }
}
