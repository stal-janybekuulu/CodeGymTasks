package com.codegym.task.task07.task0721;

import java.io.IOException;
import java.util.Scanner;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        int[] array = new int[20];

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<20; i++) {
            array[i] = Integer.parseInt(scanner.next());
        }

        int maximum = array[0];
        int minimum = array[0];

        for (int i=0; i<array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
            else if (array[i] > maximum) {
                maximum = array[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
