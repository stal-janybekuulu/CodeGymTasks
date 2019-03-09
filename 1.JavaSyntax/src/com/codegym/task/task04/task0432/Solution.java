package com.codegym.task.task04.task0432;



/* 
You can't have too much of a good thing

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int number = scanner.nextInt();
        int count = 0;
        while (count < number) {
            System.out.println(text);
            number -= 1;
        }
    }
}
