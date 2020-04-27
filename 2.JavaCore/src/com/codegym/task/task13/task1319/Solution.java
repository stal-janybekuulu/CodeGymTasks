package com.codegym.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/* 
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args) {
        // write your code here
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));

            while (true) {
                String s = reader.readLine();
                if (s.equals("exit")) {
                    break;
                } else {
                    writer.write(s);
                    writer.newLine();
                }
            }
            writer.write("exit");
            reader.close();
            writer.close();
        } catch (Exception e) {
        }
    }
}
