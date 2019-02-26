package com.codegym.task.task04.task0436;


/* 
Drawing a rectangle

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++)
            System.out.print(8);
            System.out.println();
        }
    }
}
