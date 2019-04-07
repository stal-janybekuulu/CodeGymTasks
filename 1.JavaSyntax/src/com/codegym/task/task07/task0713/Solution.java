package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int countNumbers = 20;
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        for (int i=0; i<countNumbers; i++) {
            int a = scanner.nextInt();
            arrayList.add(a);
        }

        for (Integer a: arrayList) {
            if (a%3==0 && a%2==0) {
                three.add(a);
                two.add(a);
            }
            else if (a%3==0 && a%2!=0) {
                three.add(a);
            }
            else if (a%3!=0 && a%2==0) {
                two.add(a);
            }
            else {
                other.add(a);
            }
        }
        printList(three);
        printList(two);
        printList(other);
    }

    public static void printList(List<Integer> list) {
        for (Integer l: list) {
            System.out.println(l);
        }
    }
}
