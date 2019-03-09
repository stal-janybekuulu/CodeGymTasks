package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        if (this.age > anotherCat.age || this.weight > anotherCat.weight || this.strength > anotherCat.strength)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.age = 2;
        cat1.weight = 3;
        cat1.strength = 4;
        cat2.age = 1;
        cat2.weight = 2;
        cat2.weight = 3;
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
