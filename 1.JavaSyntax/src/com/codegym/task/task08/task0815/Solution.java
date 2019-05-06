package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> list = new HashMap<>();
        for (int i =0; i < 10; i++) {
            list.put("firstName" + i, "lastName" + i);
        }
        return list;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        //write your code here
        int firstNameCount = 0;
        for (Map.Entry<String, String> v: map.entrySet()) {
            if (v.getValue().equalsIgnoreCase(name)) {
                firstNameCount++;
            }
        }
        return firstNameCount;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        //write your code here
        int lastNameCount = 0;
        for (Map.Entry<String, String> v: map.entrySet()) {
            if (v.getKey().equalsIgnoreCase(lastName)) {
                lastNameCount++;
            }
        }
        return lastNameCount;
    }

    public static void main(String[] args) {

    }
}
