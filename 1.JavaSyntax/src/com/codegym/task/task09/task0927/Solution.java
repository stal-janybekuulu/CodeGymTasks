package com.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Ten cats

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //write your code here
        HashMap<String, Cat> catsMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat("Name" + i);
            catsMap.put(cat.name, cat);
        }
        return catsMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //write your code here
        HashSet<Cat> sets = new HashSet<>();
        for (Map.Entry<String, Cat> v : map.entrySet()) {
            sets.add(v.getValue());
        }
        return sets;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
