package com.codegym.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("lastName" + i, "firstName" + i);
        }
        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //write your code here
        ArrayList<String> NewList = new ArrayList<>();
        HashMap<String, String> Copy = new HashMap<>(map);

        for (Map.Entry<String,String> pair : Copy.entrySet()
        ) {

            if (!NewList.contains(pair.getValue()))
            {
                NewList.add(pair.getValue());
            }
            else
            {
                removeItemFromMapByValue(map, pair.getValue());
            }

        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
