package com.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Words in reverse

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();
        int countOfWords = 5;

        for (int i=0; i<countOfWords; i++) {
            String word = scanner.nextLine();
            array.add(word);
        }

        array.remove(2);

        for (int i=array.size()-1; i>=0; i--) {
            System.out.println(array.get(i));
        }
    }
}


