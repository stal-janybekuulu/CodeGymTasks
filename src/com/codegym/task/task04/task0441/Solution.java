package com.codegym.task.task04.task0441;


/* 
Somehow average

*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(MidInt(a, b, c));

        // System.out.println((a + b + c) / 3);
//        if (a == b && b == c && a == c) {
//            System.out.println(a);
//        }
//        else if (a == b) {
//            System.out.println(b);
//        }
//        else if (b == c) {
//            System.out.println(c);
//        }
//        else if (a == c) {
//            System.out.println(a);
//        }
//        else {
//            System.out.println((a + b + c) / 3);
//        }
    }
    public static int MidInt(int a, int b, int c) {
        //Проверка а
        if ((b < a && a < c) || (c < a && a < b))
            return a;
        //Проверка b
        else if ((a < b && b < c) || (c < b && b < a))
            return b;
        //Проверка условия задачи
        else if ((a == b) || (b == c))
            return b;
        //Без проверки с
        else return c;
    }
}
