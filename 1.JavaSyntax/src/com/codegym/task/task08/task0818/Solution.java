package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //write your code here
        HashMap<String, Integer> list = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            list.put("lastName" + i, 495 + i);
        }
        return list;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //write your code here
        HashMap<String, Integer> m = new HashMap<>(map);
        Iterator<HashMap.Entry<String, Integer>> l = m.entrySet().iterator();
        while (l.hasNext()) {
            Map.Entry<String, Integer> value = l.next();
            if (value.getValue() < 500) {
                map.remove(value.getKey());
            }
        }
        /*for (Map.Entry<String, Integer> v: map.entrySet()) {
            if (v.getValue() < 500) {
                map.remove(v.getKey());

            }
        }*/
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}