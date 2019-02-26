package com.codegym.task.task04.task0434;


/* 
Multiplication table

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
//        Код из интернета
//        int x = 1, y = 1;
//        while (x <= 10) {
//            System.out.print(x + " ");
//            while (y <= 9) {
//                y ++;
//                System.out.print("" + x * y + " ");
//            }
//            x ++;
//            y = 1;
//            System.out.println(" ");
//        }

        // Мой код :-)
        int x = 1;
        while (x <= 10) {
            int y = 1;
            while (y <=10) {
                System.out.print(y * x + " ");
                y += 1;
            }
            x += 1;
            System.out.println(" ");
        }

    }
}
