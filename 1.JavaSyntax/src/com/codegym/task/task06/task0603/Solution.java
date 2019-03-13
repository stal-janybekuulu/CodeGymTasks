package com.codegym.task.task06.task0603;

/* 
Cat and Dog objects: 50,000 each

*/

public class Solution {
    public static void main(String[] args) {
        //int countCat = 0;
        //int countDog = 0;
        //String catObject;
        //String dogObject;

        for (int i=1; i<=50000;i++) {
            //catObject = "cat" + i;
            Cat cat = new Cat();
            Dog dog = new Dog();
        }
//        while (countCat <= 50000) {
//            Cat cat = new Cat();
//            countCat ++;
//        }
//
//        while (countDog <= 50000) {
//            Dog dog = new Dog();
//            countDog ++;
//        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
