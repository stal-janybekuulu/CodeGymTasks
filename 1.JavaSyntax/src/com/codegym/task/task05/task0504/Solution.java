package com.codegym.task.task05.task0504;


/* 
The Three "Muscateers"

*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("cat1", 5, 3, 5);
        Cat cat2 = new Cat("cat2", 4, 6, 6);
        Cat cat3 = new Cat("cat3", 5, 7, 8);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}