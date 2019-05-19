package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat inDateFormar = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        try {
            String s = scanner.nextLine();
            Date d = inDateFormar.parse(s);

            System.out.println(outDateFormat.format(d).toUpperCase());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
