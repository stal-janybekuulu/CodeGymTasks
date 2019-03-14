package com.codegym.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int numbers = scanner.nextInt();
        while (numbers > 0) {
            if (numbers % 2 == 0) {
                even++;
            }
            else odd++;
            numbers /= 10;
        }
//        System.out.println(Integer.parseInt(numbers));
//        for (int i=1; i<=length; i++) {
//            if (Integer.parseInt(numbers)%2==0) {
//                even++;
//                length--;
//            }
//            else odd++;
//        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }

}
