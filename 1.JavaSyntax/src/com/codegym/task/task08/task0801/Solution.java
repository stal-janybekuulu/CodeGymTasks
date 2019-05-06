package com.codegym.task.task08.task0801;

/* 
HashSet of plants

*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        HashSet<String> hs = new HashSet<>();
        hs.add("watermelon");
        hs.add("banana");
        hs.add("cherry");
        hs.add("pear");
        hs.add("cantaloupe");
        hs.add("blackberry");
        hs.add("ginseng");
        hs.add("strawberry");
        hs.add("iris");
        hs.add("potato");

        for (String h: hs) {
            System.out.println(h);
        }
    }
}
