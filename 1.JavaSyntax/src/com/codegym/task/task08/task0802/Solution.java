package com.codegym.task.task08.task0802;

/* 
HashMap of 10 pairs

*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        HashMap<String, String> kv = new HashMap<>();
        kv.put("watermelon", "melon");
        kv.put("banana", "fruit");
        kv.put("cherry", "fruit");
        kv.put("pear", "fruit");
        kv.put("cantaloupe", "melon");
        kv.put("blackberry", "fruit");
        kv.put("ginseng", "root");
        kv.put("strawberry", "fruit");
        kv.put("iris", "flower");
        kv.put("potato", "tuber");

        for (Map.Entry<String, String> v : kv.entrySet()) {
            String key = v.getKey();
            String value = v.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
