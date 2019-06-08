package com.codegym.task.task10.task1015;

import java.util.ArrayList;
import java.util.Random;

/* 
Array of string lists

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //write your code here
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String>[] arrayLists = new ArrayList[20];

        String l = "String";
        String l1 = "String1";

        for (int i = 0; i < 10; i++) {
            list.add(l + new Random(i));
            list1.add(l1 + new Random(i));
            arrayLists[i] = list;
            arrayLists[i+10] = list1;
        }

        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}