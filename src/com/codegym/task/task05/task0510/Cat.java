package com.codegym.task.task05.task0510;

/* 
Initializing cats

*/

public class Cat {
    String name = null;
    int weight = 3;
    int age = 2;
    String color = "Black";
    String address = null;

    public void initialize(String name) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.age = age;
        this.address = address;
    }




    public static void main(String[] args) {

    }
}
