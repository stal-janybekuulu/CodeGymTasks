package com.codegym.task.task04.task0423;

/* 
Bouncer policy

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();
        if (age > 20) {
            System.out.println("18 is old enough");
        }
    }
}
