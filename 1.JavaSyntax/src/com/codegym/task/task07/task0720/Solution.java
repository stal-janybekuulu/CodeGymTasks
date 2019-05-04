package com.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Shuffled just in time

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<N; i++) {
            list.add(scanner.next());
        }
        for (int i=0; i<M; i++) {
            list.add(list.get(0));
            list.remove(0);
        }
        for (String l: list) {
            System.out.println(l);
        }
    }
}
