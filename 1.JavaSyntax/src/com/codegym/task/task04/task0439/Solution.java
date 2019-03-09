package com.codegym.task.task04.task0439;

/* 
Chain letter

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i=1; i<=10; i++) {
            System.out.println(name + " loves me.");
        }

    }
}
