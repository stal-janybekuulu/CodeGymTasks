package com.codegym.task.task04.task0404;

/* 
Cat register

*/

public class Cat {
    private static int catCount = 0;

    public static void addNewCat() {
        catCount++;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat.addNewCat();
        System.out.println(catCount);
    }
}
