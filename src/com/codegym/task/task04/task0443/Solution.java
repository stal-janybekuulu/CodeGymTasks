package com.codegym.task.task04.task0443;


/* 
A name is a name

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int yyyy = scanner.nextInt();
        int mm = scanner.nextInt();
        int dd = scanner.nextInt();

        System.out.println("My name is " + name + ".");
        System.out.println("I was born on " + mm + "/" + dd + "/" + yyyy);
    }
}
