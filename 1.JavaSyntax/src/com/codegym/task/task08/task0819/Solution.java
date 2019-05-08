package com.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set of cats

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //write your code here. step 3
        for (Cat c: cats) {
            cats.remove(c);
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //write your code here. step 2
        Set<Cat> cats = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4
        for (Cat c: cats) {
            System.out.println(c);
        }
    }

    // step 1
    public static class Cat {

    }
}
