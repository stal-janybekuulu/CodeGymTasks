package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader   = new BufferedReader(new InputStreamReader(System.in));
        InputStream fileName    = new FileInputStream(reader.readLine());

        BufferedReader  input   = new BufferedReader(new InputStreamReader(fileName));

        ArrayList<Integer> numbers = new ArrayList<>();

        try {
            while (true) {
                int data = Integer.parseInt(input.readLine());
                if (data % 2 == 0)
                    numbers.add(data);
            }

        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        } finally {
            input.close();
        }

        Collections.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
