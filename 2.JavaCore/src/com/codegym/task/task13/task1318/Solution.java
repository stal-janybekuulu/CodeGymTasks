package com.codegym.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Reading a file

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // write your code here

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = bufferedReader.readLine();

            FileInputStream fileInputStream = new FileInputStream(fileName);

            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                System.out.print((char)data);
            }
            bufferedReader.close();
            fileInputStream.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}