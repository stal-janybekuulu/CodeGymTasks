package com.codegym.task.task05.task0509;

/* 
Create a Friend class

*/

public class Friend {
    String name = null;
    int age = 0;
    char sex = 0;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
