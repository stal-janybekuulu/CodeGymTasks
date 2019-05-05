package com.codegym.task.task07.task0726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cat code won't compile

*/

public class Solution {
    public final static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            } else {
                int age = Integer.parseInt(scanner.nextLine());
                int weight = Integer.parseInt(scanner.nextLine());
                int tailLength = Integer.parseInt(scanner.nextLine());
                Cat cat = new Cat(name, age, weight, tailLength);
                CATS.add(cat);
            }

        }

        printList();
    }

    public static void printList() {
        for (Cat cat : CATS) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}